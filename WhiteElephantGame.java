import java.util.*;

/**
 * Created by Bryan Tamada on 12/13/15.
 *
 * White Elephant Game Class Design
 *
 */
public class WhiteElephantGame extends Exception {

    private static class Person {
        String name;
        int order;
        Gift gift;
        boolean hasGift;
        boolean giftStolen;

        public Person(String n) {
            this.name = n;
        }

        public void openGift() {
            this.gift.isOpen = true;
        }

        public void setGift(Gift g) {
            this.gift = g;
            this.hasGift = true;
        }

        public Gift getGift() {
            if(this.hasGift) return this.gift;
            else return null;
        }

        public String getName() {
            return this.name;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public int getOrder() {
            return this.order;
        }

        public Gift stealGift(HashMap<String,Gift> stealPool, String name) {
            if(stealPool.isEmpty()) System.out.println("No gifts to steal!");
            return stealPool.get(name);
        }

        public void giftStolen() {
            this.giftStolen = true;
        }
    }

    private static class Gift {
        String contents;
        boolean isOpen;
        Person oldOwner;
        Person newOwner;
        Person receiver;

        public Gift(String c) {
            this.contents = c;
        }

        public String getContents() {
            return this.contents;
        }

        public void oldOwner(Person oldOwner) {
            this.oldOwner = oldOwner;
        }

        public Person getOldOwner() {
            return this.oldOwner;
        }

        public void newOwner(Person newOwner) {
            this.newOwner = newOwner;
        }

        public Person getNewOwner() {
            return this.newOwner;
        }

        public void setReceiver(Person r) {
            this.receiver = r;
        }

        public Person getReceiver() {
            return this.receiver;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Person> queue = new LinkedList<>();
        ArrayList<Integer> hat = new ArrayList<>();
        LinkedList<Gift> giftPool = new LinkedList<>();

        // add people to the queue
        for(int i = 0; i < 10; ++i) {
            queue.add(new Person(sc.nextLine()));
        }

        // add 10 numbers into the hat
        for(int i = 0; i < 10; ++i) {
            hat.add(i);
        }

        // create 10 gifts
        Gift g0 = new Gift("iPad");
        Gift g1 = new Gift("iPhone");
        Gift g2 = new Gift("Mouse Pad");
        Gift g3 = new Gift("Mouse");
        Gift g4 = new Gift("Glasses");
        Gift g5 = new Gift("Tape");
        Gift g6 = new Gift("Cookies");
        Gift g7 = new Gift("Headphones");
        Gift g8 = new Gift("Stapler");
        Gift g9 = new Gift("Kendama");

        // add the gifts to the gift pool
        giftPool.add(g0);
        giftPool.add(g1);
        giftPool.add(g2);
        giftPool.add(g3);
        giftPool.add(g4);
        giftPool.add(g5);
        giftPool.add(g6);
        giftPool.add(g7);
        giftPool.add(g8);
        giftPool.add(g9);

        // shuffle the gift pool
        Collections.shuffle(giftPool);

        // shuffle the numbers
        Collections.shuffle(hat);

        // assign the numbers to each of the 10 people
        for(int i = 0; i < 10; ++i) {
            Person temp = queue.remove();
            temp.setOrder(hat.get(i));
            queue.add(temp);
        }

        // sort the order of the people in the queue
        Person[] orderedArray = new Person[queue.size()];
        Queue<Person> orderedQueue = new LinkedList<>();
        HashMap<String,Gift> stealPool = new HashMap<>();
        while(!queue.isEmpty()) {
            orderedArray[queue.peek().getOrder()] = queue.poll();
        }

        // insert the People into an ordered queue
        for(Person p : orderedArray) {
            orderedQueue.add(p);
        }

        boolean flag;
        boolean isFirstPerson = true;

        System.out.println("Welcome to the White Elephant Game!");
        while(!orderedQueue.isEmpty() && !giftPool.isEmpty()) {
            Person p = orderedQueue.poll();
            flag = true;
            // the first person in the queue
            if (p.getOrder() == 0 && isFirstPerson) {
                p.setGift(giftPool.poll()); // set the gift
                p.getGift().oldOwner(p); // set the gift receiver person
                p.openGift(); // open the gift
                stealPool.put(p.getGift().getContents(), p.getGift()); // add the gift into the steal pool
                System.out.println(p.getName() + " received a " + p.getGift().getContents());
                orderedQueue.add(p); // put the first person back into the queue
                isFirstPerson = false;
            } else {
                // the rest of the players...
                while(flag) {
                    System.out.println(p.getName() + ": What do you want to do?");
                    int choice;
                    System.out.println("1) Steal a gift");
                    System.out.println("2) Open a new gift");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("What gift do you want to steal? ");
                            String giftToSteal = sc.next();
                            // if a player already had a gift stolen from them...
                            Gift gv = stealPool.get(giftToSteal);
                            if(stealPool.containsKey(giftToSteal) && gv.getOldOwner().getName().equals(p.getName())) {
                                System.out.println("You cannot steal your own gift!");
                                break;
                            }
                            if(!stealPool.containsKey(giftToSteal)) {
                                System.out.println("That gift does not exist in the steal pool...");
                                break;
                            }
                            Gift stolenGift = p.stealGift(stealPool, giftToSteal);
                            Person oldOwner = stolenGift.getOldOwner();
                            p.setGift(stolenGift);
                            p.getGift().newOwner(p);
                            stealPool.put(stolenGift.getContents(),stolenGift);
                            System.out.println(p.getName() + " stole a " +
                                    p.getGift().getContents() + " from " + oldOwner.getName());
                            p = oldOwner;
                            oldOwner.giftStolen();
                            break;
                        case 2:
                            System.out.println("Opening a new gift");
                            if (giftPool.peek() != null) {
                                p.setGift(giftPool.poll());
                                p.getGift().oldOwner(p);
                                stealPool.put(p.getGift().getContents(),p.getGift());
                                System.out.println(p.getName() + " received a " + p.getGift().getContents());
                            } else {
                                System.out.println("No more gifts in the gift pool!");
                            }
                            flag = false;
                            break;
                        default:
                            System.out.println("Invalid Choice!  Please pick another option.");
                            break;
                    }
                }
                if(p.getOrder() == 9) isFirstPerson = true;
            }
        }
        System.out.println("Thank you for playing the White Elephant Game!");
        sc.close();
    }

}
