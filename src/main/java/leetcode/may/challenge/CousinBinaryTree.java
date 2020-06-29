package leetcode.may.challenge;

/*
https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3322/
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class CousinBinaryTree {

    TreeNode root;

    public int level(TreeNode node, int ptr, int lev) {
        if (node == null) {
            return 0;
        }

        if (node.val == ptr) {
            return lev;
        }

        int l = level(node.left, ptr, lev + 1);

        if (l != 0) {
            return l;
        }

        return level(node.right, ptr, lev + 1);
    }

    boolean isSibling(TreeNode node, int a, int b) {
        if (node == null) {
            return false;
        }
        return ((node.left != null && node.left.val == a && node.right != null && node.right.val == b) ||
                (node.left != null && node.left.val == b && node.right != null && node.right.val == a) ||
                isSibling(node.left, a, b) ||
                isSibling(node.right, a, b));
    }

    public boolean isCousins(TreeNode node, int a, int b) {
        return ((level(node, a, 1) == level(node, b, 1)) &&
                (!isSibling(node, a, b)));
    }

    public static void main(String[] args) {
        CousinBinaryTree tree = new CousinBinaryTree();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.left.right.right = new TreeNode(15);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);
        tree.root.right.left.right = new TreeNode(8);

        TreeNode node1, node2;
        node1 = tree.root.left.left;
        node2 = tree.root.right.right;
        System.out.println(" node.left " + node1.val + " right " + node2.val);
        System.out.println(" are cousins: " + tree.isCousins(tree.root, node1.val, node2.val));

    }
}
