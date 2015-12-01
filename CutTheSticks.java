import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by User1 on 11/30/15.
 */
public class CutTheSticks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numArr = new int[N];
        int remainder = N;
        int cut = 0;
        int cutAmt = 0;
        int prevCutAmt = 0;
        int counter = 0;

        for(int i = 0; i < N; ++i) {
            numArr[i] = sc.nextInt();
        }

        while(remainder > 0) {

            Arrays.sort(numArr);

            for(int i = 0; i < numArr.length; ++i) {
                if(numArr[i] > 0) {
                    cut = numArr[i];
                    break;
                }
            }

            prevCutAmt = cutAmt;
            cutAmt = 0;
            for(int i = 0; i < numArr.length; ++i) {
                if (numArr[i] <= 0) continue;
                else {
                    numArr[i] -= cut;
                    cutAmt++;
                    if(numArr[i] <= 0) remainder -= 1;
                }
            }
            if(prevCutAmt != cutAmt) System.out.println(cutAmt);
        }


    }

}
