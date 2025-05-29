package Trees;

import java.util.ArrayList;
import java.util.List;

//Preorder - Root, Left, Right.
public class TreeTraversals extends BinaryTree{

    public List<Integer> preOrderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        helper3(root, res);
        return res;
    }

    private void helper3(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        helper(root.left, res);
        helper(root.right, res);
    }
    


    // InOrder Traversal - left->root->right
    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper2(root, res);
        return res;
    }

    private void helper2(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        helper(root.left, res);
        res.add(root.val);
        helper(root.right, res);
    }


    // PostOrder - left->right->root
    public List<Integer> postOrderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        helper(root.left, res);
        helper(root.right, res);
        res.add(root.val);
    }
}
