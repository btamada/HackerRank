import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Bryan Tamada on 12/23/15.
 */
public class LibraryFine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] actualReturnDate = new String[3];
        String[] expectedReturnDate = new String[3];
        actualReturnDate = sc.nextLine().split(" ");
        expectedReturnDate = sc.nextLine().split(" ");

        HashMap<Integer,Integer> calendar = new HashMap<>();
        calendar.put(1,31);
        calendar.put(2,28);
        calendar.put(3,31);
        calendar.put(4,30);
        calendar.put(5,31);
        calendar.put(6,30);
        calendar.put(7,31);
        calendar.put(8,31);
        calendar.put(9,30);
        calendar.put(10,31);
        calendar.put(11,30);
        calendar.put(12,31);

        int actualDay = Integer.parseInt(actualReturnDate[0]);
        int actualMonth = Integer.parseInt(actualReturnDate[1]);
        int actualYear = Integer.parseInt(actualReturnDate[2]);
        int expectedDay = Integer.parseInt(expectedReturnDate[0]);
        int expectedMonth = Integer.parseInt(expectedReturnDate[1]);
        int expectedYear = Integer.parseInt(expectedReturnDate[2]);

        int fine = 0;
        if(actualYear <= expectedYear) {
            if(actualYear == expectedYear && actualMonth <= expectedMonth && actualDay <= expectedDay)
                fine = 0;
            if(actualYear < expectedYear)
                fine = 0;
        }
        if (actualDay > expectedDay && actualMonth == expectedMonth && actualYear == expectedYear) {
            fine = 15 * (actualDay - expectedDay);
        }
        if (actualMonth != expectedMonth && actualYear == expectedYear) {
            if(actualMonth < expectedMonth)
                fine = 0;
            else
                fine = 500 * Math.abs(actualMonth - expectedMonth);
        }
        if (actualYear > expectedYear) {
            fine = 10000;
        }
        System.out.println(fine);
    }

}
