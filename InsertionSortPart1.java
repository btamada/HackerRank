import java.util.Scanner;

/**
 * Created by Bryan Tamada on 12/18/15.
 *
 * Insertion Sort Part 1
 */
public class InsertionSortPart1 {

        public static void insertIntoSorted(int[] ar) {
            int num = ar[ar.length - 1];
            boolean isSet = false;
            for(int i = ar.length - 2; i >= 0 && !isSet; --i) {
                if(ar[i] > num) {
                    ar[i+1] = ar[i];
                    printArray(ar);
                } else if (ar[i] <= num) {
                    ar[i+1] = num;
                    isSet = true;
                }
            }
            if(!isSet) ar[0] = num;
            printArray(ar);
        }
        /* Tail starts here */
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int s = in.nextInt();
            int[] ar = new int[s];
            for(int i=0;i<s;i++){
                ar[i]=in.nextInt();
            }
            insertIntoSorted(ar);
        }


        private static void printArray(int[] ar) {
            for(int n: ar){
                System.out.print(n+" ");
            }
            System.out.println("");
        }

}
