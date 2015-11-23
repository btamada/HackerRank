import java.util.Stack;

public class SplitNumbers {

    public static void main(String[] args) {

        int num = 327104;

        Stack<Integer> st = new Stack<>();

        // separate out the numbers individually and in order
        while(num > 0) {
            st.push(num % 10);
            num /= 10;
        }

        // pop the elements off the stack and multiply by 10^i
        for(int i = st.size(); i > 0; --i) {
            if (i == 1) {
                System.out.print(st.pop() * (int)Math.pow(10,i-1));
            } else {
                System.out.print(st.pop() * (int)Math.pow(10,i-1) + " + ");
            }
        }

    }

}
