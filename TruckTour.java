import java.util.*;

/**
 * Created by Bryan Tamada on 12/10/15.
 */
public class TruckTour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> petrol = new LinkedList<>();
        Queue<Integer> distance = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        int N = sc.nextInt();
        int destination = N;

        while(N-->0) {
            petrol.add(sc.nextInt());
            distance.add(sc.nextInt());
        }

        long tank = 0;
        int net = 0;
        int result = 0;
        for(int loop = 0; loop < destination; ++loop) {
            net = petrol.peek() - distance.peek();
            if(tank + net > 0) {
                if(result == 0) {
                    result = loop;
                }
                tank += net;
            } else {
                tank = 0;
                result = 0;
            }
            petrol.add(petrol.remove());
            distance.add(distance.remove());
        }

        System.out.println(result);
        sc.close();
    }

}
