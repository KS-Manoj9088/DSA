package Trees;
import java.util.*;

public class MaxDepthOfBinaryTree extends BinaryTree{
    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        tree1.createBinaryTree();
        
        int maxdepth = maxDepth(root); // Ensure `root` is accessible
        System.out.println("Max Depth of Tree: " + maxdepth);

        int maxdepth2 = maxDepth2(root);
        System.out.println(maxdepth2);
    }

    // By DFS
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + Math.max(left, right);
    }

    // By BFS

    public static int maxDepth2(TreeNode root){
        if(root == null){
            return 0;
        }
        int depth = 0;
        Queue<TreeNode> q1 = new LinkedList<>();
        q1.offer(root);

        while (!q1.isEmpty()) {
            int size = q1.size();
            for(int i= 0;i < size; i++){
                TreeNode node = q1.poll();

                if(node.left!=null){
                    q1.offer(node.left);
                }

                if(node.right!=null){
                    q1.offer(node.right);
                }
            }
            depth++;
        }
        return depth;
    }
}