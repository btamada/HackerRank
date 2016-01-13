import java.util.Scanner;

/**
 * Created by Bryan Tamada on 1/12/16.
 */
public class QuicksortPartition {

    static void partition(int[] ar) {
        int pivot = ar[0];
        int pivotindex = 0;
        for (int i = 1; i < ar.length; ++i) {
            int temp = 0;
            if(ar[i] < pivot) {
                temp = ar[i];
                int j = i;
                while(j > pivotindex){
                    ar[j] = ar[--j];
                }
                pivotindex = j + 1;
                ar[j] = temp;
            }
        }
        printArray(ar);
    }

    static void printArray(int[] ar) {
        for(int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++) {
            ar[i]=in.nextInt();
        }
        partition(ar);
    }

}
