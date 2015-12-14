import java.util.Scanner;

/**
 * Created by Bryan Tamada on 12/13/15.
 */
public class LonelyInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; ++i) {
            arr[i] = sc.nextInt();
        }
        int result = 0;
        for(int i = 0; i < arr.length; ++i) {
            result ^= arr[i];
        }
        System.out.println(result);

    }

}
