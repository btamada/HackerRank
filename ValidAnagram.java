import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(isAnagram(s,t));
    }

    static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        for(int i = 0; i < sChar.length; ++i) {
            if(sChar[i] != tChar[i]) return false;
        }

        return true;
    }

}
