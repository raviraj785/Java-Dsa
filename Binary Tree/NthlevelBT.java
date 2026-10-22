class PreorderTraversalTree{
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

  public static void nthlevel(Node root , int n ){
    if (root == null ) return ;
    if(n == 1)
        { 
            System.out.print(root.val + " ");
               return ;
        }
    nthlevel(root.left , n-1);
    nthlevel(root.right , n-1);
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
        Node f = new Node(45);
        b.left = e;
        b.right = f;
        int level = height(root) + 1;
      for(int i = 1 ; i <= level ; i++ ){
        nthlevel(root, i);
        System.out.println();
      }


    }
}

