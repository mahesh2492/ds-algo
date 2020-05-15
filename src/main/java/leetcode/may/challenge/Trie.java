package leetcode.may.challenge;

/*
https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3329/
 */
public class Trie {

    static final int size = 26;
    static Node root;

        static class Node {

        Node[] children = new Node[size];
        boolean isCompletedWord;

        Node() {
            isCompletedWord = false;
            for(int i = 0; i < size; i++) {
                children[i] = null;
            }
        }
    }

   static void insert(String key) {
        int level, length = key.length(), index;

        Node current = root;

        for(level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';

            if(current.children[index] == null) {
                current.children[index] = new Node();
            }
            current = current.children[index];

        }
       current.isCompletedWord = true;
   }

   static boolean search(String key) {
        int index, level, len = key.length();

        Node current = root;

        for(level = 0; level < len; level++) {
            index = key.charAt(level) - 'a';

            if(current.children[index] == null) {
                return false;
            }

            current = current.children[index];
        }
        return current.isCompletedWord;
   }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public static boolean startsWith(String key) {
        int index, level, len = key.length();

        Node current = root;

        for(level = 0; level < len; level++) {
            index = key.charAt(level) - 'a';

            if(current.children[index] == null) {
                return false;
            }

            current = current.children[index];
        }

        if(level == len) {
            return (current != null);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] keys = {"apple", "the", "there", "a", "any",
                "by", "bye", "their"};

        root = new Node();

        for (String key : keys) {
            insert(key);
        }

        if(search("app")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        if(search("any")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        if(startsWith("app")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
