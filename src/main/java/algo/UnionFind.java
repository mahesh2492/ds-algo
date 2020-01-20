package algo;

import scala.io.StdIn;

import java.util.Scanner;

public class UnionFind {

    private int[] id;
    private int count;

    public UnionFind(int n) {
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
        return id[p];
    }

    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);

        if (pId == qId) {
            return;
        }

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pId) {
                id[i] = qId;
            }
        }

        count--;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p, q ;
        UnionFind uf = new UnionFind(n) ;
        System.out.println("size " + n);
        while(n-- > 0) {
            p = sc.nextInt() ;
            q = sc.nextInt() ;

            if(uf.connected(p, q)) continue;
            System.out.println("n!!!!!!!!!!!!!!1" + n);
            uf.union(p, q);

            System.out.println("Combined Components: " + p + " " + q);
        }

        System.out.println("Connected Components: " + uf.getCount());
    }
}
