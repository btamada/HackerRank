/**
 * Created by User1 on 12/8/15.
 */
public class MaxSubArray {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] subarr = {4,-1,2,1};
        int sum = 0;
        int counter = 0;

        for(int i = 0; i < subarr.length; ++i) {
            if(arr[i] == subarr[counter]) {
                while(counter < subarr.length && i < arr.length) {
                    if(arr[i] == subarr[counter]) {
                        i++;
                        sum += subarr[counter];
                        counter++;
                    } else {
                        counter = 0;
                        break;
                    }
                }
            }
        }

        System.out.println("The max sum is: " + sum);
        System.out.println("Counter of integers: " + counter);
    }

}
