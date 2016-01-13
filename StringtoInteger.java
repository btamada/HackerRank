/**
 * Nintendo Screening Questions
 * 1) Write code to solve one of the following problems using  Java. The code should include a function prototype, and handle and throw proper exceptions.
 * - Given two lists, return the values that are in list1 but not in list2.
 * - Write a function to convert a string to integer (without using parseInt or similar).
 */

public class StringtoInteger {

    public int stringToInteger(String input) {
        int intResult = 0;
        boolean isNegative = false;
        try {
            if (input == null || input.isEmpty()) {
                intResult = -1;
                throw new InvalidInput();
            }
            char ch[] = input.toCharArray();
            int zeroASCII = (int) '0';

            for (int i = 0; i < ch.length; ++i) {
                if (ch[i] == '-') {
                    isNegative = true;
                    continue;
                }
                int tmpChar = (int) ch[i];
                if (!Character.isDigit(tmpChar)) {
                    intResult = -1;
                    throw new InvalidInput();
                }
                intResult = (intResult * 10) + tmpChar - zeroASCII;
            }
        } catch (InvalidInput e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isNegative ? intResult *= -1 : intResult;
    }

}

class InvalidInput extends Exception {
    public InvalidInput() {
        System.out.println("Not a valid input string!");
    }
}