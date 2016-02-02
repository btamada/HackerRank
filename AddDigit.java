import java.util.Scanner;

public class AddDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(addDigit(num));
    }

    static int addDigit(int num) {
        boolean flag = true;
        int newNum = num;
        while(flag) {
            num = newNum;
            newNum = 0;
            // calculate the sum of each number
            while(num > 0) {
                newNum += num % 10;
                num = num / 10;
            }
            flag = (newNum >= 0 && newNum <= 9) ? false : true;
        }
        return newNum;
    }
}
