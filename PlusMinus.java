/**
 *Created by User1 on 11/15/15.
 */

import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double posSum = 0.0;
        double negSum = 0.0;
        double zeroSum = 0.0;

        int temp = 0;

        for(int i = 0; i < N; ++i) {
            temp = sc.nextInt();
            if(temp < 0) ++negSum;
            if(temp > 0) ++posSum;
            if(temp == 0) ++zeroSum;
        }

        System.out.printf("%.3f",posSum / N);
        System.out.println();
        System.out.printf("%.3f", negSum / N);
        System.out.println();
        System.out.printf("%.3f",zeroSum / N);

    }
}
