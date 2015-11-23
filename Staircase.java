/**
 * Created by User1 on 11/15/15.
 */

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String finalTime = "";
        int hh = Integer.parseInt(time.substring(0,2));

        if(time.endsWith("AM")) {
            if(hh == 12) {
                hh -= 12;
                finalTime += "0" + hh + time.substring(2, time.length() - 2);
            } else {
                finalTime += time.substring(time.length() - 2);
            }
        }

        if(time.endsWith("PM")) {
            if(hh != 12) {
                hh += 12;
                finalTime += hh + time.substring(2,time.length()-2);
            } else {
                finalTime += hh + time.substring(2,time.length()-2);
            }
        }

        System.out.println(finalTime);
    }

}
