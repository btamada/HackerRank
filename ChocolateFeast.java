import java.util.Scanner;

/**
 * Created by User1 on 11/30/15.
 */
public class ChocolateFeast {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int N = 0;
        int C = 0;
        int M = 0;
        int totalChoc = 0;
        int tempChoc = 0;
        int wrappers = 0;

        while(T-->0) {
            totalChoc = 0;
            N = sc.nextInt();
            C = sc.nextInt();
            M = sc.nextInt();

            totalChoc += N / C;

            tempChoc = totalChoc;

            if(tempChoc - M == 0) {
                totalChoc++;
            } else if(tempChoc / M >= 1) {
                do {
                    wrappers = tempChoc / M; // 2
                    totalChoc += wrappers; // 1959
                    tempChoc = (tempChoc % M) + (tempChoc / M);
                } while (tempChoc >= M);
            }

            System.out.println(totalChoc);
        }

    }

}
