import java.util.LinkedList;

/**
 * Created by Bryan Tamada on 12/12/15.
 *
 * Convert a BST to a LinkedList
 * Convert a LinkedList to a BST
 */
public class BSTtoLL {

    private static class Node<T> {
        T data;
        Node left, right;
        public Node(){}
        public Node(T data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> result = new LinkedList<>();

        // Create a BST
        Node<Integer> root = new Node<Integer>(7);
        root.left = new Node<Integer>(4);
        root.left.left = new Node<Integer>(1);
        root.left.right = new Node<Integer>(5);
        root.right = new Node<Integer>(12);
        root.right.left = new Node<Integer>(9);
        root.right.right = new Node<Integer>(15);

        // Create the LinkedList
        createLL(root, result);

        /*System.out.println("Printing out the results...");
        for(Integer i : result) {
            System.out.println(i);
        }*/

        Node newBST = createBST(result,0,result.size()-1);
        print(newBST);
    }

    private static void print(Node root) {
        if(root == null) return;
        print(root.left);
        System.out.println(root.data);
        print(root.right);
    }

    private static void createLL(Node root, LinkedList<Integer> result) {
        if(root == null) return;
        createLL(root.left, result);
        result.add((Integer) root.data);
        createLL(root.right, result);
    }

    // 1->4->5->7->9->12->15->NULL
    private static Node<Integer> createBST(LinkedList<Integer> result, int start, int end) {
        if(start > end) return null;
        int mid = start + (end - start) / 2;
        Node leftChild = createBST(result, start, mid - 1);
        Node parent = new Node(result.remove());
        parent.left = leftChild;
        parent.right = createBST(result, mid+1, end);
        return parent;
    }
}
