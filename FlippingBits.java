import java.util.Scanner;

/**
 * Created by Bryan Tamada on 12/21/15.
 */
public class FlippingBits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long maxInt = Integer.MAX_VALUE;
        while(T-->0) {
            System.out.println(~sc.nextLong() + 0x0000000100000000L);
        }
    }

}
