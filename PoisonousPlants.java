import java.util.Scanner;
import java.util.Stack;

/**
 * Created by User1 on 11/12/15.
 */
public class PoisonousPlants {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Plant[] plants = new Plant[sc.nextInt() + 1];

        // place live plants onto the stack
        Stack<Plant> stack = new Stack<>();

        // plants/pesticide array
        for(int i = 1; i < plants.length; ++i) {
            plants[i] = new Plant(sc.nextInt(),i);
            stack.push(plants[i]);
        }

        // stack order: 9 10 7 4 8 5 6

        // numbers of days the plants survive
        int days = 0;
        boolean flag = true;
        Plant item1 = null;
        Plant item2 = null;

        while (flag) {
            if(stack.size() < 2) {
                flag = false;
            } else {
                // check which items are empty
                if(days == 0) {
                    item1 = stack.pop();
                    item2 = stack.pop();
                }

                if(item2 == null) {
                    item2 = stack.pop();
                } else if(item1 == null) {
                    item1 = stack.pop();
                }

                if(item2.pesticide < item1.pesticide) {
                    stack.remove(item2);
                    item2 = null;
                }

            }
        }
    }

    static class Plant {
        int plant;
        int pesticide;

        Plant(int plant, int pesticide) {
            this.plant = plant;
            this.pesticide = pesticide;
        }
    }


}
