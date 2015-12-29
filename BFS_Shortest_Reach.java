import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

/**
 * Created by User1 on 12/21/15.
 */
public class BFS_Shortest_Reach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer,Integer> adjList = new LinkedHashMap<>();
        int T = sc.nextInt();
        int N = 0;
        int M = 0;
        while(T-->0) {
            N = sc.nextInt(); // # of nodes in the graph
            M = sc.nextInt(); // # of edges in the graph
            int[] nums = new int[M * 2 + 1];
            for(int i = 1; i < nums.length; i+=2) {
                nums[i-1] = sc.nextInt();
                nums[i] = sc.nextInt();
            }
            nums[nums.length-1] = sc.nextInt();

            for(int i = 1; i < nums.length; i+=2) {
                adjList.put(nums[i-1],nums[i]);
            }
            adjList.put(nums[nums.length-1], -1);
        }
    }

}
