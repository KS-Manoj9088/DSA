package Trees;
import java.util.*;

public class IterativeTreeTraversals extends BinaryTree{
    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        tree1.createBinaryTree();

        IterativeTreeTraversals it1 = new IterativeTreeTraversals();

        List<Integer> preOrder = it1.preOrderTraversal(root);
        System.out.println(preOrder);

        List<Integer> inOrder = it1.inOrderTraversal(root);
        System.out.println(inOrder);

        List<Integer> postOrder = it1.postOrderTraversal(root);
        System.out.println(postOrder);
    }


    public List<Integer> preOrderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Stack<TreeNode> stck = new Stack<>();
        stck.push(root);

        while(!stck.isEmpty()){
            TreeNode node = stck.pop();
            res.add(node.val);

            if(node.right!=null){
                stck.push(node.right);
            }

            if(node.left!=null){
                stck.push(node.left);
            }
        }
        
        return res;
    }

    public List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root == null){
            return res;
        }
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) { // Ensure all nodes are processed
            while (node != null) { // Push all left nodes first
                stack.push(node);
                node = node.left;
            }
            node = stack.pop(); // Pop last left node
            res.add(node.val);  // Process it
            node = node.right;  // Move to right subtree
        }
        return res;
    }

    public List<Integer> postOrderTraversal(TreeNode root){

        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        
        Stack<TreeNode> s1 = new Stack<>();
        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode n1 = s1.pop();
            res.add(n1.val);  // Pushing the top of stk1 to stk2.

            // Pushing the n1's children to stck1.
            if(n1.left!=null){
                s1.push(n1.left);
            }

            if(n1.right!=null){
                s1.push(n1.right);
            }
        }

        // Stack2 contains our answer and push it to ArrayList.
        return res.reversed();
    }
}