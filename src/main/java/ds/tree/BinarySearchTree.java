package ds.tree;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinarySearchTree {

    static TreeNode root;

    BinarySearchTree() {
        root = null;
    }

    void inOrder(TreeNode root) {
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    void preOrder(TreeNode root) {
        if(root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void postOrder(TreeNode root) {
        if(root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    void insert(int element) {
        TreeNode newNode = new TreeNode(element);
        TreeNode parent = null, current = root;

        if(root == null) {
            root = newNode;
            return;
        }

        while (current != null) {
            parent = current;

            if(current.data < element) {
                current = current.right;
            } else {
                current = current.left;
            }
        }

        if(parent.data < element) {
            parent.right = newNode;
        } else {
            parent.left = newNode;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.print("Inorder Traversal of Bst: ");
        bst.inOrder(root);

        System.out.print("\nPreorder Traversal of Bst: ");
        bst.preOrder(root);

        System.out.print("\nPostorder Traversal of Bst: ");
        bst.postOrder(root);

    }
}
