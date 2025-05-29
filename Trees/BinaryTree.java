package Trees;

public class BinaryTree {
    public static TreeNode root;

    // Static nested class for TreeNode
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.val = data;
            this.left = null;
            this.right = null;
        }
    }

    // Method to create a predefined binary tree
    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root = first;     // Assign first node as root
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;

        third.left = sixth;
        third.right = seventh;
    }

    // In-order traversal method (Left -> Root -> Right)
    public void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.val + "->");
        inorderTraversal(node.right);
    }

    // Pre-Order traversal method(Root -> Left -> Right)
    public void preorderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.val+"->");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    // Post-Order traversal method(Left -> Right -> Root)
    public void postorderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.val+"->");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.createBinaryTree();

        System.out.println("In-order Traversal of Binary Tree:");
        tree.inorderTraversal(root);

        System.out.println("\nPre-order Traversal of Binary Tree:");
        tree.preorderTraversal(root);

        System.out.println("\nPost-order Traversal of Binary tree");
        tree.postorderTraversal(root);
    }
}