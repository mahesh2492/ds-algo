package algo.dynamicconnectivity;

import java.util.Scanner;

/*
 Better than Quick Find but still for large tree it is not efficient too.
 */
public class QuickUnion {
    private int[] id;
    private int count;

    public QuickUnion(int n) {
        count = n;
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public int getCount() {
        return count;
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public int find(int p) {
        while (p != id[p]) {
            p = id[p];
        }

        return p;
    }

    public void quickUnion(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);

        if (qRoot == pRoot) return;

        id[pRoot] = qRoot;

        count--;
    }

    public static void main(String[] args) {
        int n, p, q;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        QuickUnion qu = new QuickUnion(n);

        while (n-- > 0) {
            p = sc.nextInt();
            q = sc.nextInt();

            System.out.println("Root of p before connection: " + p + "  " + qu.find(p));
            System.out.println("Root of q before connection: " + q + "  " +  qu.find(q));
            if (qu.connected(p, q)) continue;
            qu.quickUnion(p, q);

            System.out.println("Combined Components: " + p + " " + q);
            System.out.println("Root of p: " + p + "  " + qu.find(p));
            System.out.println("Root of q: " + q + "  " +  qu.find(q));
        }

        System.out.println("Connected Components: " + qu.getCount());
    }
}
