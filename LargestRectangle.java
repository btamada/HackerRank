import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Bryan Tamada on 12/12/15.
 */
public class LargestRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int N = sc.nextInt();
        int[] hist = new int[N];
        for(int i = 0; i < N; ++i) {
            hist[i] = sc.nextInt();
        }
        System.out.println(getMaxArea(hist,N));
    }

    private static int getMaxArea(int[] hist, int n) {
        Stack<Integer> stack = new Stack<>();
        int max_area = 0;
        int tp = 0;
        int area_with_top = 0;
        int i = 0;

        while(i < n) {
            if(stack.empty() || hist[stack.peek()] <= hist[i]){
                stack.push(i++);
            } else {
                tp = stack.pop();
                area_with_top = hist[tp] * (stack.empty() ? i : i - stack.peek() - 1);

                if(max_area < area_with_top) max_area = area_with_top;
            }
        }

        while(!stack.empty()){
            tp = stack.pop();
            area_with_top = hist[tp] * (stack.empty() ? i : i - stack.peek() - 1);

            if(max_area < area_with_top) max_area = area_with_top;
        }

        return max_area;
    }
}
