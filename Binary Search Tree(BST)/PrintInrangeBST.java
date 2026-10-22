

class PrintInrangeBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void printinrange(Node root, int k1, int k2) {
        if (root == null) return;

        if (root.data >= k1 && root.data <= k2) {
            printinrange(root.left, k1, k2);
            System.out.println(root.data + " ");
            printinrange(root.right, k1, k2);
        } else if (root.data < k1) {
            printinrange(root.left, k1, k2);
        } else {
            printinrange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {
        int value[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }

        printinrange(root, 5, 10);
    }
}
