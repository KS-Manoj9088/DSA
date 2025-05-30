package Trees;
import java.util.*;

public class LevelOrderTraversal extends BinaryTree {
    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        tree1.createBinaryTree();

        LevelOrderTraversal l1 = new LevelOrderTraversal();
        List<List<Integer>> lvlOrderTraversal = l1.levelOrderTraversal(root);
        System.out.println(lvlOrderTraversal);
    }

    public List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> outer = new ArrayList<>();
        if (root == null) {
            return outer; // Return an empty list instead of [[]]
        }

        Queue<TreeNode> q1 = new LinkedList<>();
        q1.offer(root);

        while (!q1.isEmpty()) {
            int queueSize = q1.size();
            List<Integer> inner = new ArrayList<>(); // Create inner list outside the loop

            for (int i = 0; i < queueSize; i++) {
                TreeNode current = q1.poll(); // Poll once to get the current node
                inner.add(current.val);

                if (current.left != null) {
                    q1.offer(current.left);
                }
                if (current.right != null) {
                    q1.offer(current.right);
                }
            }
            outer.add(inner); // Add the collected values for this level
        }
        return outer;
    }
}