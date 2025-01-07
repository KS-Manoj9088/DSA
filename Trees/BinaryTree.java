package Trees;

public class BinaryTree {
    public static TreeNode root;

    public class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data){
            this.val = data;
            this.left = null;
            this.right = null;
        } 
    }

    public static void main(String[] args){
        
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }
}
