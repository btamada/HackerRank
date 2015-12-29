import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Bryan Tamada on 12/29/15.
 */
public class TwoStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String result = "";
        String A = "";
        String B = "";
        while(T-->0) {
            result = "NO";
            A = sc.next();
            B = sc.next();
            for (char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
                if(A.indexOf(c) != -1 && B.indexOf(c) != -1) result = "YES";
            }
            System.out.println(result);
        }
    }

}
