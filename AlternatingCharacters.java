import java.util.Scanner;

/**
 * Created by User1 on 12/1/15.
 */
public class AlternatingCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int numDeletions = 0;
        String str = "";
        while(T-->0) {
            numDeletions = 0;
            str = sc.next();
            for (int i = 1; i < str.length(); ++i) {
                if (str.charAt(i - 1) != str.charAt(i)) {
                    continue;
                } else {
                    numDeletions++;
                }
            }
            System.out.println(numDeletions);
        }
    }
}
