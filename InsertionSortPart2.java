import java.util.Scanner;

/**
 * Created by Bryan Tamada on 12/18/15.
 *
 * Insertion Sort Part 2
 */

public class InsertionSortPart2 {
        public static void insertionSortPart2(int[] ar) {
            for(int i = 1; i < ar.length; ++i) {
                for(int j = i-1; j >= 0; --j) {
                    if(ar[j] > ar[j+1]) swap(ar,j,j+1);
                }
                printArray(ar);
            }
        }

        private static void swap(int[] arr, int x, int y) {
            int tmp = arr[x];
            arr[x] = arr[y];
            arr[y] = tmp;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int s = in.nextInt();
            int[] ar = new int[s];
            for(int i=0;i<s;i++){
                ar[i]=in.nextInt();
            }
            insertionSortPart2(ar);
        }

        private static void printArray(int[] ar) {
            for(int n: ar){
                System.out.print(n+" ");
            }
            System.out.println("");
        }
}
