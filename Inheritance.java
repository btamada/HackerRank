/**
 * Created by Bryan Tamada on 12/10/15.
 */
public class Inheritance {

    interface Birds {

    }

    static class Animal {
        void walk() {
            System.out.println("I am walking");
        }
    }

    static class Bird extends Animal {
        /*void fly() {
            System.out.println("I am flying");
        }

        void sing() {
            System.out.println("I am singing");
        }*/
    }

    static class Woodpecker extends Mammal {
        void peck() {
            System.out.println("I am pecking");
        }

        void setName(String name) {
            this.name = name;
        }

        @Override
        void getName() {
            System.out.println("Yo, my fucking name is: " + this.name);
        }
    }

    static abstract class Mammal {
        String name;

        abstract void setName(String s);

        void getName() {
            System.out.println("Hello, my name is: " + this.name);
        }
    }

    public static void main(String[] args) {
        Woodpecker wp = new Woodpecker();
        wp.setName("Woody");
        wp.getName();
    }

}
