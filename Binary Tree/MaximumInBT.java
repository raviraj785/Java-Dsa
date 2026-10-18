class MaximumInBT{
    public static class Node {
      int val ;
      Node left;
      Node right;
    
    public Node(int val){
        this.val= val;
    }
}
 
   public static int max(Node root){
    if(root == null ) return Integer.MIN_VALUE;

    int a = root.val;
    int b = max(root.left);
    int c = max(root.right);
  return Math.max(a, Math.max(b, c));


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
         
       System.out.println(max(root));

    }
}


