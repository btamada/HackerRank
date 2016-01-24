public class ArmstrongNumber {

    public static void main(String... foobar) throws Exception {
        System.out.println(armstrongNumber(371));
    }

    static boolean armstrongNumber(int n) {
        if(n <= 0) return false;
        int originalValue = n;
        int sum = 0;
        while(n != 0) {
            int remainder = n % 10;
            sum += (int) Math.pow(remainder,3);
            n = n / 10;
        }
        if(sum == originalValue) return true;
        return false;
    }
}