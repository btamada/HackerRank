import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * HackerRank: Java 1D Array (Hard)
 *
 * 1) You can only move to a index whose value contains 0
 * 2) You can walk one space forwards (x + 1)
 * 3) You can walk one space backwards (x - 1)
 * 4) You can jump m spaces forward
 * 5) You can move to any position greater than n-1
 * 6) You cannot move backwards from position 0 (beginning of the array)
 * 7) You win if you move to any position > (n - 1)
 * 8) Determine if it is possible to with given the constraints
 * 9) Starting position is guaranteed to be 0
 */

public class Java1DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int n = 0;
        int m = 0;
        int pos = 0;
        boolean win = false;
        while (T-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            Queue<Integer> currentPositions = new LinkedList<>();
            Queue<Integer> newPositions = new LinkedList<>();
            ArrayList<Integer> pastPositions = new ArrayList<>();
            int[] numArray = new int[n];

            for (int i = 0; i < n; ++i) {
                numArray[i] = sc.nextInt();
            }

            // starting position
            currentPositions.add(0);

            while (currentPositions.size() > 0) {
                //System.out.println("Current Positions Size: " + currentPositions.size());
                newPositions.clear();
                win = false;
                //System.out.println("Before Foreach Loop");
                //System.out.println("Current Position Head Value: " + currentPositions.peek());
                for (int v : currentPositions) { // 3-1-NULL
                    //System.out.println("In Foreach Loop");
                    if (v + m >= numArray.length || v + 1 >= numArray.length) {
                        win = true;
                        //System.out.println("Surpassed or equal array length: " + win);
                        break;
                    }

                    if (numArray[v + m] == 0 && pastPositions.indexOf(v + m) < 0) {
                        newPositions.add(v + m);
                        //System.out.println("Added new jump position: " + (v+m) ) ;
                        if (v + m > n - 1) {
                            win = true;
                            //System.out.println("Jump surpassed or equal array length: " + win);
                            break;
                        }
                    }

                    if (v != 0 && numArray[v - 1] == 0 && pastPositions.indexOf(v - 1) < 0) {
                        newPositions.add(v - 1);
                        //System.out.println("Added new back position: " + (v-1));
                    }

                    if (numArray[v + 1] == 0 && pastPositions.indexOf(v + 1) < 0) {
                        newPositions.add(v + 1);
                        //System.out.println("Added forward new position: " + (v + 1));
                        if (v + 1 > n - 1) {
                            win = true;
                            //System.out.println("Forward surpassed or equal array length: " + win);
                            break;
                        }
                    }
                }

                if (win == true) break;

                pastPositions.addAll(currentPositions);

                for (int pp : pastPositions) {
                    //System.out.println("Past Position: " + pp);
                }

                currentPositions.clear();

                currentPositions.addAll(newPositions);

                for (int cp : currentPositions) {
                    //System.out.println("Current Position: " + cp);
                }


            }

            if (win == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}