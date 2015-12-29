/**
 * Created by Bryan Tamada on 12/10/15.
 */
public class BitOperators {

    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        int c = 0;
        int d = 0xABCD;
        int e = 0x47EF;

        // Divide a # by 2 -> Right Shift N by 1 e.g. N >> 1
        // You are essentially moving from the bits 2^N -> 2^N-1
        int n = 1234;
        System.out.println(n + " divided by 2 equals: " + (n >> 1));

        // Multiply a # by 2 -> Left Shift N by 1 e.g. N << 1
        // You are essentially moving from the bits 2^N -> 2^N+1
        n = 20;
        System.out.println(n + " multipled by 2 equals: " + (n << 1));

        // AND & operator
        c = a & b;
        System.out.println("a & b = " + c);

        // IOR | operator
        c = a | b;
        System.out.println("a | b = " + c);

        // XOR ^ operator
        c = a ^ b;
        System.out.println("a ^ b = " + c);

        // NOT operator
        c = ~a;
        System.out.println("~a = " + c);
        c = ~b;
        System.out.println("~b = " + c);

        // Shift Left X bits a << x
        c = a << 2;
        System.out.println("a << 2 = " + c);

        // Shift Right Y bits a >> y
        c = a >> 2;
        System.out.println("a >> 2 = " + c);

        // Shift Right Y bits and append with leading zeros to MSB a >>> y
        c = a >>> 2;
        System.out.println("a >>> 2 = " + c);

    }

}
