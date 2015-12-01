import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String result = "";

        while(T-->0) {
            String origString = sc.next();
            String revString = "";

            for(int i = origString.length()-1; i >= 0; --i) {
                revString += origString.charAt(i);
            }

            int os = 0;
            int rs = 0;

            for(int i = 1; i < origString.length(); ++i) {
                os = Math.abs((origString.charAt(i) - origString.charAt(i-1)));
                rs = Math.abs((revString.charAt(i) - revString.charAt(i-1)));

                if(os != rs) {
                    result = "Not Funny";

                } else {
                    result = "Funny";
                }
            }

            T--;
        }

        System.out.println(result);
    }
}
