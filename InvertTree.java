import java.util.LinkedList;

public class InvertTree {

    public static void main(String... args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        invertTree(root);
        printLevelOrder(root);
    }

    static TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }

    static void printLevelOrder(TreeNode root) {
        if(root == null) return;
        LinkedList<TreeNode> ll = new LinkedList<>();
        ll.add(root);
        while(!ll.isEmpty()) {
            System.out.println(ll.peek().val);
            if(ll.peek().left != null) ll.add(ll.peek().left);
            if(ll.peek().right != null) ll.add(ll.peek().right);
            ll.poll();
        }
    }

}
