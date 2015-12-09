/**
 * Created by User1 on 12/8/15.
 */
public class SwapNodes {

    static class Node {
        char data;
        Node next;

        Node() {}

        Node(char c) {
            this.data = c;
        }

        Node(Node n) {
            this.next = n;
        }

        Node(char c, Node n) {
            this.data = c;
            this.next = n;
        }
    }

    public static void main(String[] args) {
        Node na = new Node('a');
        Node nb = new Node('b');
        Node nc = new Node('c');
        Node nd = new Node('d');

        na.next = nb;
        nb.next = nc;
        nc.next = nd;

        swapNodes(na);

        print(na);
    }

    private static void swapNodes(Node head) {
        Node current = head;

        while(current != null) {
            swap(current,current.next);
            current = current.next.next;
        }
    }

    private static void swap(Node p, Node n) {
        char temp = p.data;
        p.data = n.data;
        n.data = temp;
    }

    private static void print(Node head) {
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

}
