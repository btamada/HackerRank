import java.util.Scanner;
import java.util.Stack;

/**
 * Created by User1 on 12/1/15.
 */
public class LinkedLists {

    static class Node {
        Node next;
        int data;

        Node(){}

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Node head1 = new Node();
        Node nA1 = new Node(2);
        Node nA2 = new Node(4);
        Node nA3 = new Node(6);
        Node nA4 = new Node(8);
        Node nA5 = new Node(10);

        head1.next = nA1;
        nA1.next = nA2;
        nA2.next = nA3;
        nA3.next = nA4;
        nA4.next = nA5;

        Node head2 = new Node();
        Node nB1 = new Node(1);
        Node nB2 = new Node(3);
        Node nB3 = new Node(5);
        Node nB4 = new Node(7);
        Node nB5 = new Node(9);

        head2.next = nB1;
        nB1.next = nB2;
        nB2.next = nB3;
        nB3.next = nB4;
        nB4.next = nB5;

        //print(mergeLists(head1,head2));
        //print(head);
        //reverse(head);
        //findVal(head,3);
        //print(newHead(head,6));
        //print(newTail(head,6));
        //print(insertNode(head,-1));
    }

    static Node mergeLists(Node head1, Node head2) {
        if(head1 == null) return head2;
        if(head2 == null) return head1;

        Node returnNode = null;

        if(head1.data <= head2.data) {
            returnNode = head1;
            returnNode.next = mergeLists(head1.next,head2);
        } else {
            returnNode = head2;
            returnNode.next = mergeLists(head1, head2.next);
        }

        return returnNode;
    }

    static Node circList(Node head) {
        if(head == null) return head;
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = head;

        return head;
    }

    static void reverse(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node current = head;

        while(current != null) {
            stack.push(current.data);
            current = current.next;
        }

        while(!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    static boolean findVal(Node head, int data) {
        boolean val = false;
        if(head == null) return false;
        Node current = head;
        while(current != null) {
            if(current.data == data) {
                val = true;
                break;
            }
            current = current.next;
        }
        System.out.println(val);
        return val;
    }

    static Node newHead(Node head, int data) {
        Node newHead = new Node(data);
        if(head == null) {
            head = newHead;
            return head;
        }
        newHead.next = head;
        return newHead;
    }

    static Node newTail(Node head, int data) {
        Node newTail = new Node(data);
        if(head == null) {
            head = newTail;
            return head;
        }

        Node current = head;
        while(current.next != null) {
            current = current.next;
        }

        current.next = newTail;
        return head;
    }

    static Node insertNode(Node head, int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return head;
        }

        Node current = head;
        Node prev = head;

        if(current.data > data) {
            newNode.next = head;
            return newNode;
        }

        while(current.next != null) {
            if(current.data > data) {
                prev.next = newNode;
                newNode.next = current;
                break;
            }
            prev = current;
            current = current.next;
        }

        // if reached the end w/o setting the new node
        if(current.next == null) {
            current.next = newNode;
        }

        return head;
    }

    static void print(Node head) {
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
