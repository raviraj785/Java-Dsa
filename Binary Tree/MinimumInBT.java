class MinimumInBT{
    public static class Node {
      int val ;
      Node left;
      Node right;
    
    public Node(int val){
        this.val= val;
    }
}
 
   public static int min(Node root){
    if(root == null ) return Integer.MAX_VALUE;

    int a = root.val;
    int b = min(root.left);
    int c = min(root.right);
  return Math.min(a, Math.min(b, c));


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
         
       System.out.println(min(root));

    }
}


