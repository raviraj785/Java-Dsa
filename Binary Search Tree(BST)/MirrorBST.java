

class MirrorBST {

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

    public static Node createMirror(Node root) {
        if (root == null) {
            return null;
        }

        Node leftMirror = createMirror(root.left);
        Node righMirror = createMirror(root.right);

        root.left = righMirror;
        root.right = leftMirror;

        return root;
    }

    public static void preordder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preordder(root.left);
        preordder(root.right);
    }

    public static void main(String[] args) {
        int value[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }

        root = createMirror(root);
        preordder(root);
    }
}
