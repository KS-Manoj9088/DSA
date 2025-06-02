package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepthOfBinaryTree extends BinaryTree{
    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        tree1.createBinaryTree();

        MinDepthOfBinaryTree mdt = new MinDepthOfBinaryTree();

        int mindepth = mdt.minimumDepth(root);
        System.out.println(mindepth);

        int mindepth2 = minDepth2(root);
        System.out.println(mindepth2);
    }

    public int minimumDepth(TreeNode root){
        if(root==null){
            return 0;
        }

        if(root.left==null && root.right==null){
            return 1;
        }

        if(root.left==null && root.right!=null){
            return 1+minimumDepth(root.right);
        }

        if(root.right==null && root.left!=null){
            return 1+minimumDepth(root.left);
        }

        int left = minimumDepth(root.left);
        int right = minimumDepth(root.right);

        return 1+Math.min(left, right);
    }

     public static int minDepth2(TreeNode root){
        if(root == null){
            return 0;
        }
        int depth = 1;
        Queue<TreeNode> q1 = new LinkedList<>();
        q1.offer(root);

        while (!q1.isEmpty()) {
            int size = q1.size();
            for(int i= 0;i < size; i++){
                TreeNode node = q1.poll();

                // Check if the tree-node has reached the leaf nodes.
                if(node.left==null && node.right==null){
                    return depth;
                }

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
