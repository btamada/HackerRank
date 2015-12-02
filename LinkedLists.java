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
        Node head = new Node();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        //print(head);
        //reverse(head);
        //findVal(head,3);
        //print(newHead(head,6));
        //print(newTail(head,6));
        //print(insertNode(head,-1));
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
