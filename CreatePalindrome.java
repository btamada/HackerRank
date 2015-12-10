import java.util.HashMap;
import java.util.Set;

/**
 * Created by Bryan Tamada on 12/9/15.
 *
 * Interview Question - Qualtrics
 * Determine if the given string can form a palindrome
 */
public class CreatePalindrome {

    public static void main(String[] args) {
        System.out.println(palCreate("eeddeddee"));
    }

    static boolean palCreate(String input) {
        if(input == null) return false;

        HashMap<Character,Integer> hm = new HashMap<>();
        char[] inpCharArr = input.toCharArray();

        for(int i = 0; i < inpCharArr.length; ++i) {
            if(hm.get(inpCharArr[i]) == null) {
                hm.put(inpCharArr[i],1);
            } else {
                int val = hm.get(inpCharArr[i]);
                hm.put(inpCharArr[i],++val);
            }
        }

        Set myKeys = hm.keySet();
        int counter = 0;

        for(Object c : myKeys) {
            int vals = hm.get(c);

            if(vals % 2 != 0) {
                counter++;
            }
        }
        return (counter > 1) ? false : true;
    }
}
