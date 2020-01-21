package algo.dynamicconnectivity;

import java.util.Scanner;

public class WeightedQuickUnionFind {

    private int[] id;
    private int[] sz;
    private int count;

    public WeightedQuickUnionFind(int n) {
        count = n;
        id = new int[n];
        sz = new int[n];

        for (int i = 0; i < n; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public int getCount() {
        return count;
    }

    public int find(int p) {
        while (p != id[p]) p = id[p];
        return p;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);

        if (pRoot == qRoot) return;

        if (sz[pRoot] < sz[qRoot]) {
            id[pRoot] = qRoot;
            sz[qRoot] += sz[pRoot];
        } else {
            id[qRoot] = pRoot;
            sz[pRoot] += sz[qRoot];
        }

        --count;
    }

    public static void main(String[] args) {

        int n, p, q;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        WeightedQuickUnionFind weightedQuickUnionFind = new WeightedQuickUnionFind(n);

        while (n-- > 0) {
            p = sc.nextInt();
            q = sc.nextInt();

            System.out.println("Root of p before connection: " + p + "  " + weightedQuickUnionFind.find(p));
            System.out.println("Root of q before connection: " + q + "  " + weightedQuickUnionFind.find(q));
            if (weightedQuickUnionFind.connected(p, q)) continue;
            weightedQuickUnionFind.union(p, q);

            System.out.println("Combined Components: " + p + " " + q);
            System.out.println("Root of p: " + p + "  " + weightedQuickUnionFind.find(p));
            System.out.println("Root of q: " + q + "  " + weightedQuickUnionFind.find(q));
        }

        System.out.println("Connected Components: " + weightedQuickUnionFind.getCount());

    }
}
