import java.util.Scanner;

/**
 * Created by User1 on 11/29/15.
 */
public class UtopianTree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int N = 0;
        int treeHeight = 1;

        while(T-->0) {
            treeHeight = 1;
            N = sc.nextInt();
            for(int i = 1; i <= N; ++i) {
               if(i % 2 == 0) {
                   treeHeight += 1;
               } else {
                   treeHeight += treeHeight;
               }
            }
            System.out.println(treeHeight);
        }

    }
}
