import java.util.Scanner;

/**
 * Created by Bryan Tamada on 12/13/15.
 */
public class MaximizingXOR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int maxValue = 0;
        int bitwiseValue = 0;

        // iterate through the L calculations
        for(int i = L; i <= R; ++i) {
            bitwiseValue = L ^ i;
            if(maxValue < bitwiseValue) maxValue = bitwiseValue;
        }

        // iterate through the R calculations
        for(int i = L+1; i <= R; ++i) {
            bitwiseValue = R ^ i;
            if(maxValue < bitwiseValue) maxValue = bitwiseValue;
        }

        System.out.println(maxValue);
    }
}
