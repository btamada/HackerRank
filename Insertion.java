/**
 * Created by User1 on 11/12/15.
 */

import java.util.LinkedList;

public class Insertion {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static int getNode(Node root, int n) {
        if(root == null) return 0;

        // find length of the LL
        int length = 0;

        Node current = root;

        while(current.next != null) {
            ++length;
            current = current.next;
        }

        //System.out.println(length);

        // iterate through the list until we find n
        current = root;

        while(length > n && current.next != null) {
            current = current.next;
            --length;
        }

        return current.data;
    }

    // find a node given a position and return its data
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n3 = new Node(3);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        head.next = n3;
        n3.next = n5;
        n5.next = n6;

        System.out.println(getNode(head, 1));
     }

}
