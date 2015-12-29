import java.util.Scanner;

/**
 * Created by Bryan Tamada on 11/29/15.
 */
public class StockMaximizer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int N = 0;

        while(T-- > 0) {
            N = sc.nextInt();
            long[] nums = new long[N];

            // inserts numbers into the nums array
            for(int i = 0; i < N; ++i) {
                nums[i] = sc.nextInt();
            }

            long maxSum = 0;
            long expense = 0;
            for(int i = 1; i < N; ++i) {
                if(nums[i-1] > nums[i]) continue;
                else {
                    maxSum += (nums[i-1] * nums[i]) - (nums[i-1] * nums[i-1]);
                }
            }

            System.out.println(maxSum);
        }
    }
}
