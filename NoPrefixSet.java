import java.util.Scanner;

/**
 * Created by Bryan Tamada on 1/3/16.
 */
public class NoPrefixSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Trie trie = new Trie();
        String result = "";
        String resulStr = "";
        while(N-->0) {
            String str = sc.next();
            if(!trie.find(str,trie.root)) trie.insert(str);
            else {
                System.out.println("BAD SET");
                System.out.println(str);
                return;
            }
        }
        System.out.println("GOOD SET");
    }
}

class Trie {
    TrieNode root;
    public void insert(String str) {
        if(root == null) root = new TrieNode(' ');
        insertUtil(str,root);
    }

    public void insertUtil(String str, TrieNode root) {
        for(int i = 0; i < str.length(); ++i) {
            int z = atoi(str.charAt(i));
            if(root.nodes[z] == null) root.nodes[z] = new TrieNode(str.charAt(i));
            root = root.nodes[z];
        }
        root.isWord = true;
    }

    public int atoi(char ch) {
        if(ch >= 97) return ch - 97;
        return -1;
    }

    public boolean flag = false;

    public boolean find(String str, TrieNode root) {
        if(root == null) return false;
        for(int i = 0; i < str.length(); ++i) {
            int z = atoi(str.charAt(i));
            if(root.nodes[z] == null) return false;
            if(root.nodes[z].isWord == true) return true;
            root = root.nodes[z];
        }
        return true;
    }
}

class TrieNode {
    char data;
    boolean isWord;
    TrieNode[] nodes;

    public TrieNode(char data) {
        this.data = data;
        nodes = new TrieNode[32];
    }
}
