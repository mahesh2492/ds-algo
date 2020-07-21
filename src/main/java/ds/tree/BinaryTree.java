package ds.tree;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeNode {
    int data;
    BinaryTreeNode left, right;

    BinaryTreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }

}

public class BinaryTree {
    static BinaryTreeNode root;

    public BinaryTree() {
        root = null;
    }

    void insert(BinaryTreeNode temp, int data) {
        BinaryTreeNode newNode = new BinaryTreeNode(data);
        Queue<BinaryTreeNode> queue = new LinkedList<>();

        if (temp == null) {
            temp = newNode;
            root = temp;
            return;
        }

        queue.add(temp);

        while (!queue.isEmpty()) {
            temp = queue.peek();
            queue.remove();

            if (temp.left == null) {
                temp.left = newNode;
                break;
            } else {
                queue.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = newNode;
                break;
            } else {
                queue.add(temp.right);
            }
        }

    }

    void inorder(BinaryTreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        root = new BinaryTreeNode(10);
        root.left = new BinaryTreeNode(11);
        root.left.left = new BinaryTreeNode(7);
        root.right = new BinaryTreeNode(9);
        root.right.left = new BinaryTreeNode(15);
        root.right.right = new BinaryTreeNode(8);

        System.out.println("Binary Tree before insertion: ");
        binaryTree.inorder(root);

        binaryTree.insert(root, 12);
        System.out.println("\nBinary Tree after insertion: ");
        binaryTree.inorder(root);

    }
}
