public class MaxDepthBinaryTree {

    public static void main(String... foobar) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(5);
        root.right.left.right = new TreeNode(6);
        root.right.left.right.right = new TreeNode(7);
        root.right.left.right.right.left = new TreeNode(8);
        root.right.left.right.right.left.left = new TreeNode(9);
        root.right.left.right.right.left.left.right = new TreeNode(9);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int leftSubtree = maxDepth(root.left) + 1;
        int rightSubtree = maxDepth(root.right) + 1;
        return Math.max(leftSubtree, rightSubtree);
    }

}

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { this.val = x; }
}