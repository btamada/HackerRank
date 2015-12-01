import java.util.Scanner;

/**
 * Created by User1 on 11/28/15.
 */
public class ArrayIntersection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N = 0;
        int nTmp = 0;
        int temp = 0;
        int counter = 0;
        while(T-->0) {
            N = nTmp = sc.nextInt();
            counter = 0;
            while(nTmp>0) {
                temp = nTmp % 10;
                if(temp != 0 && N % temp == 0) {
                    ++counter;
                }
                nTmp /= 10;
            }
            System.out.println(counter);
        }
    }

}
