package AVLTree;



public class AvllTreeDeletion {

    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    public static Node root;

    // Calculate height
    public static int height(Node root) {
        if (root == null)
            return 0;

        return root.height;
    }

    // Right rotation
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left rotation
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Get balance factor
    public static int getBalance(Node root) {
        if (root == null)
            return 0;

        return height(root.left) - height(root.right);
    }

    // Insert node
    public static Node insert(Node root, int key) {
        if (root == null)
            return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);
        else
            return root;

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int bf = getBalance(root);

        // Left Left Case
        if (bf > 1 && key < root.left.data)
            return rightRotate(root);

        // Right Right Case
        if (bf < -1 && key > root.right.data)
            return leftRotate(root);

        // Left Right Case
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Left Case
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    // Get minimum node
    public static Node getMinNode(Node root) {
        Node curr = root;

        while (curr.left != null)
            curr = curr.left;

        return curr;
    }

    // Delete node
    public static Node deleteNode(Node root, int key) {
        if (root == null)
            return root;

        // Search in left subtree
        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        }

        // Search in right subtree
        else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        }

        // Node found
        else {
            // Node with zero or one child
            if (root.left == null || root.right == null) {
                Node temp;

                if (root.left != null)
                    temp = root.left;
                else
                    temp = root.right;

                // No child
                if (temp == null) {
                    root = null;
                }
                // One child
                else {
                    root = temp;
                }
            }

            // Node with two children
            else {
                Node temp = getMinNode(root.right);

                root.data = temp.data;

                root.right = deleteNode(root.right, temp.data);
            }
        }

        // If tree becomes empty
        if (root == null)
            return root;

        // Update height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // Get balance factor
        int bf = getBalance(root);

        // Left Left Case
        if (bf > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        // Left Right Case
        if (bf > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Right Case
        if (bf < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        // Right Left Case
        if (bf < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    // Preorder traversal
    public static void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder traversal
    public static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        System.out.println("AVL Tree Preorder:");
        preorder(root);

        System.out.println("\n\nAVL Tree Inorder:");
        inorder(root);

        // Delete a node
        root = deleteNode(root, 40);

        System.out.println("\n\nAfter deleting 40:");
        preorder(root);
    }
}
