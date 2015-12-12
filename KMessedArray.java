import java.util.Scanner;

/**
 * Created by Bryan Tamada on 12/11/15.
 *
 * Pramp Interview Question
 * The "K-Messed Array Sort" Problem
 *
 * Given an array "arr" of length n where each element is at most "k" places away from its sorted position
 * plan and code an efficient algorithm to sort "arr".
 * Analyze the runtime and space complexity of your solution.
 *
 * Example:
 * n=10, k=2.  The element belonging to index 6 in the sorted array, may be at indices 4, 5, 6, 7 or 8
 * on the given array
 */
public class KMessedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = {2,0,4,1,5,3,8,9,6,7};
        insertionSort(arr,N,K);
        print(arr);
    }

    private static void insertionSort(int[] arr, int size, int key) {
        int j = 0;
        for(int i = 1; i < size; ++i) {
            key = arr[i];
            j = i-1;
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }

    private static void print(int[] arr) {
        for(int i : arr) {
            System.out.println(i);
        }
    }

}
