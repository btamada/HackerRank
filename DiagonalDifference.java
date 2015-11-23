/**
 * Created by User1 on 11/15/15.
 */
import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];

        for(int i = 0; i < N; ++i) {
            for(int j = 0; j < N; ++j) {
                matrix[i][j] = sc.nextInt();
            }
        }

        long sum1 = 0;
        long sum2 = 0;

        for(int i = 0; i < N; ++i) {
            for(int j = 0; j < N; ++j) {
                if(i == j)
                    sum1 += matrix[i][j];

                if(j == N - 1 - i)
                    sum2 += matrix[i][j];

            }
        }

        System.out.println(Math.abs(sum1 - sum2));
    }
}
