import java.util.*;

/**
 * Created by Bryan Tamada on 12/19/15.
 *
 * Find Median
 * Use Priority Queue(s) to find the median of all N elements
 */
public class FindMedian {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PriorityQueue<Integer> min = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> max = new PriorityQueue<Integer>();
        int a = in.nextInt();
        System.out.println(String.format("%.1f", (float)a));
        if (n == 1) return;
        int b = in.nextInt();


        min.add(Math.min(a, b));
        max.add(Math.max(a, b));
        System.out.println(String.format("%.1f", ((float)(max.peek() + min.peek())) / 2));

        for (int i = 2; i < n; i++) {
            int v = in.nextInt();
            if (v >= max.peek())
                max.add(v);
            else
                min.add(v);
            if (Math.abs(max.size() - min.size()) > 1) {
                if (min.size() > max.size()) {
                    max.add(min.poll());
                } else {
                    min.add(max.poll());
                }
            }

            if (max.size() == min.size())
                System.out.println(String.format("%.1f", ((float)(max.peek() + min.peek())) / 2));
            else if (max.size() > min.size())
                System.out.println(String.format("%.1f", (float)max.peek()));
            else
                System.out.println(String.format("%.1f", (float)min.peek()));
        }

    }
}
