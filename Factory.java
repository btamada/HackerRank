import com.sun.javaws.exceptions.InvalidArgumentException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by User1 on 12/9/15.
 */
public class Factory {

    interface Food {
        public String getType();
    }

    class Pizza implements Food {
        @Override
        public String getType() {
            return "Someone ordered a Fast Food!";
        }
    }

    class Cake implements Food {
        @Override
        public String getType() {
            return "Someone ordered a Dessert!";
        }
    }

    class FoodFactory {
        public Food getFood(String order) {
            Food foodType = null;

            if(order.equalsIgnoreCase("Pizza")) {
                Pizza myPizza = new Pizza();
                foodType = myPizza;
            }

            if(order.equalsIgnoreCase("Cake")) {
                Cake myCake = new Cake();
                foodType = myCake;
            }

            return foodType;
        }
    }

    public static void main(String[] args) {

    }

}
