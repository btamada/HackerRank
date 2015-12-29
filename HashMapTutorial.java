import java.util.HashMap;
import java.util.Random;
import java.util.Set;

/**
 * Created by Bryan Tamada on 12/11/15.
 *
 * Playing with HashMaps
 */
public class HashMapTutorial {

    public static void main(String[] args) {
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();
        hm1.put('a',1);
        hm1.put('b',4);
        hm1.put('c',2);
        hm1.put('d',7);
        hm1.put('e',0);

        Set<Character> myKeys = hm1.keySet();

        /*for(Character c : myKeys) {
            System.out.println(c);
        }*/

        hm2 = (HashMap) hm1.clone();

        for(Character e : hm2.keySet()) {
            System.out.println("Cloned HashMap: " + e);
        }
    }

}
