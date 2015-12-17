import java.util.*;

/**
 * Created by Bryan Tamada on 12/16/15.
 */
public class SmallestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(smallestPalindrome(input));
    }

    static String smallestPalindrome(String input) {
        if(input == null) return null;
        char[] inputChar = input.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        Deque<Character> orderedSmallestPalindrome = new LinkedList<>();
        int countVals = 0;
        for(int i = 0; i < input.length(); ++i) {
            if(hm.get(inputChar[i]) == null) {
                hm.put(inputChar[i],1);
            } else {
                hm.put(inputChar[i],hm.get(inputChar[i])+1);
            }
        }

        Set<Character> myKeys = hm.keySet();
        String smallestPalindrome = "";
        String oddChar = "";
        boolean flag = true;
        int counter = 0;
        for(char c : myKeys) {
            if(hm.get(c) % 2 == 0) {
                orderedSmallestPalindrome.addFirst(c);
                orderedSmallestPalindrome.addLast(c);
            } else if(hm.get(c) == 1 && flag == true) {
                flag = false;
                oddChar += c;
            }
            if(flag == false && oddChar.length() != 0 && counter == myKeys.size()-1) {
                while(!orderedSmallestPalindrome.isEmpty()) {
                    smallestPalindrome += orderedSmallestPalindrome.poll();
                }
                smallestPalindrome = smallestPalindrome.substring(0,smallestPalindrome.length()/2) + oddChar + smallestPalindrome.substring(smallestPalindrome.length()/2);
            }
            counter++;
        }
        return smallestPalindrome;
    }

}
