/**
 * Created by Bryan Tamada on 1/13/16.
 */
public class FindSecondLargest {

    public static void main(String[] args) {
        System.out.println(findSecondLargest(new int[] {90,100}));
    }

    static int findSecondLargest(int[] numbers) {
        if(numbers == null || numbers.length <= 1) return -1;
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        if(numbers[0] > numbers[1]) {
            firstLargest = numbers[0];
            secondLargest = numbers[1];
        } else {
            firstLargest = numbers[1];
            secondLargest = numbers[0];
        }
        for(int i = 2; i < numbers.length; ++i) {
            if(numbers[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] <= firstLargest) {
                secondLargest = numbers[i];
            }
        }
        return secondLargest;
    }

}
