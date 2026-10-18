class PreorderTraversalTree{
    public static class Node {
      int val ;
      Node left;
      Node right;
    
    public Node(int val){
        this.val= val;
    }
}
 public static void postorder(Node root){
    if(root == null) return ;
    postorder(root.left);
    postorder(root.right);
     System.out.println(root.val);
 }
     public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left = a ;
        root.right = b;

        Node c = new Node(6);
        Node d = new Node(5);
        a.left= c;
        a.right= d ;

        Node e = new Node(11);
        b.right = e;
        postorder(root);


    }
}

