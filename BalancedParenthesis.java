import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Bryan Tamada on 1/19/16.
 */
public class BalancedParenthesis {

    public static final String OPENINGS = "{[(";
    public static final String CLOSINGS = "}])";

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int T = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < T; i++){
            String in = scan.nextLine();
            String result = isValid (in) ? "YES" : "NO";
            System.out.println (result);
        }
    }

    public static boolean isValid (String in){
        Stack<Character> opening = new Stack <Character>();

        for (int i = 0; i < in.length(); i++){
            Character c = in.charAt(i);
            if (OPENINGS.contains(Character.toString(c))){
                opening.push(c);
            } else {
                if (opening.empty()) return false;
                char popChar  = opening.pop();
                if (OPENINGS.indexOf(popChar) != CLOSINGS.indexOf(c)){
                    return false;
                }
            }
        }

        return opening.empty();
    }

}
