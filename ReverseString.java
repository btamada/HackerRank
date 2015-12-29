/**
 * Author: Bryan Tamada
 *
 * Reverse String
 *
 * Please write a function that takes a string and returns the reverse of that string.
 *
 * For example: input: “cat” result: “tac”
 *
 * Use any modern programming language you are comfortable with. Please do not use any library
 * helper functions that perform the reverse (for example, String.reverse()).
 */
public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("Qualtrics is awesome!"));
    }

    public static String reverseString(String input) {
        if(input == null) throw new IllegalArgumentException("Illegal Argument");

        char[] inputCharArr = input.toCharArray();

        for(int i = 0; i < inputCharArr.length/2; ++i) {
            char temp = inputCharArr[i];
            inputCharArr[i] = inputCharArr[inputCharArr.length-1-i];
            inputCharArr[inputCharArr.length-1-i] = temp;
        }

        return new String(inputCharArr);
    }

}
