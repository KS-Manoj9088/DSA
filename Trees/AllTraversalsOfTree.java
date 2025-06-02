package Trees;
import java.util.*;

public class AllTraversalsOfTree extends BinaryTree{
    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        tree1.createBinaryTree();

        AllTraversalsOfTree at1 = new AllTraversalsOfTree();
        List<Integer> preorder = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();

        at1.allTraversals(root, preorder, inorder, postorder);
        System.out.println(preorder);
        System.out.println(inorder);
        System.out.println(postorder);
    }

    public void allTraversals(TreeNode root,List<Integer> pre, List<Integer> in, List<Integer> post){
        if(root == null){
            return;
        }
        pre.add(root.val);

        allTraversals(root.left, pre, in, post);
        in.add(root.val);

        allTraversals(root.right, pre, in, post);
        post.add(root.val);
    }
}
