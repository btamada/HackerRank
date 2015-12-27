import java.util.Scanner;

/**
 * Created by Bryan Tamada on 12/27/15.
 */
public class SherlockSquares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int A = 0;
        int B = 0;
        int count = 0;
        while(T-->0) {
            A = sc.nextInt();
            B = sc.nextInt();
            count = 0;
            for(int i = 1; i*i <= B; ++i) {
                if(i*i >= A && i*i <= B) count++;
            }
            System.out.println(count);
        }
    }

}
