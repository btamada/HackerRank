import java.util.Scanner;

/**
 * Created by Bryan Tamada on 12/9/15.
 */
public class Pangrams {

    public static void main(String[] args) {
        boolean[] alphabet = new boolean[26];
        String result = "";
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replaceAll("\\s","");

        char[] strCharArr = input.toLowerCase().toCharArray();

        for(int i = 0; i < strCharArr.length; ++i) {
            if(alphabet[strCharArr[i] - 'a'] == false) {
                alphabet[strCharArr[i] - 'a'] = true;
            }
        }

        for(int j = 0; j < alphabet.length; ++j) {
            if(alphabet[j] == false) {
                result = "not pangram";
                break;
            }
            else result = "pangram";
        }

        System.out.println(result);
    }

}
