class HeightOfBT{
    public static class Node {
      int val ;
      Node left;
      Node right;
    
    public Node(int val){
        this.val= val;
    }
}
 
   public static int height(Node root){
    if(root == null ) return 0;

   if(root.left == null && root.right == null ) return 0;
    int a = height(root.left);
    int b = height(root.right);
  return 1 + Math.max( a ,b);


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
         
       System.out.println(height(root));

    }
}


