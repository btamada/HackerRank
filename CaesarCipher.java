import java.util.Scanner;

/**
 * Created by Bryan Tamada on 12/25/15.
 */
public class CaesarCipher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int K = sc.nextInt();
        char[] sCharArray = S.toCharArray();
        for (int i = 0; i < N; ++i) {
            if(!Character.isLetter(sCharArray[i]) && !Character.isSpaceChar(sCharArray[i])) {
                System.out.print(sCharArray[i]);
                continue;
            } else {
                char tmp = Character.isUpperCase(sCharArray[i]) ? 'A' : 'a';
                System.out.print((char) (tmp + (sCharArray[i] - tmp + K) % 26));
            }
        }
    }
}
