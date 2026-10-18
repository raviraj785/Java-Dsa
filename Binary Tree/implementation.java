class implementation{
    public static class Node {
      int val ;
      Node left;
      Node roght;
    
    public Node(int val){
        this.val= val;
    }
}
    public static void main(String[] args) {
        Node root = new Node(52);
       System.out.println(root.val);
    }
}