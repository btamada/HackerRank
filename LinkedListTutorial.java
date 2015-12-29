import java.util.LinkedList;

/**
 * Created by User1 on 12/12/15.
 */
public class LinkedListTutorial {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        // adding to the LL
        ll.add(11);
        ll.add(20);

        // printing out the LL contents
        for(int i : ll) {
            System.out.println(i);
        }

        // adding to the tail of the LL
        ll.addLast(30);

        for(int i : ll) {
            System.out.println(i);
        }

        ll.addFirst(1);
        for(int i : ll) {
            System.out.println(i);
        }
    }

}
