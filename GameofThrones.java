import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Bryan Tamada on 12/21/15.
 */
public class GameofThrones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] inputChar = input.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        int val = 0;
        for(int i = 0; i < inputChar.length; ++i) {
            if(hm.get(inputChar[i]) == null){
                hm.put(inputChar[i],1);
            } else {
                val = hm.get(inputChar[i]);
                hm.put(inputChar[i],++val);
            }
        }
        Set<Character> myKeys = hm.keySet();
        int numOdd = 0;
        String result = "YES";
        for(Character c : myKeys) {
            if(numOdd > 1) {
                result = "NO";
                break;
            }
            if(hm.get(c) % 2 != 0) numOdd++;
        }
        System.out.println(result);
    }

}
