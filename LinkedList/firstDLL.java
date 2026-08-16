public class firstDLL {
    public static class  Node {
      int val ;
      Node next; // null
      Node prev; //prev
      Node(int val){
        this.val= val;
      }
    }

    public static void display(Node head){
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.val + " ");
        temp = temp.next;
      }
      System.out.println();
    }
    public static void displayreverse(Node tail){
      Node temp = tail;
      while (temp != null) {
        System.out.print(temp.val + " ");
        temp = temp.prev;
      }
      System.out.println();
    }
    public static void displayrandom(Node random){
      Node temp = random;
      // Move this temp backwards to the head
      while (temp.prev != null) {
        temp = temp.prev;
      }
      // now temp is at head
      // print the List 
      while (temp != null) {
        System.out.print(temp.val + " ");
        temp = temp.next;
      }
      System.out.println();
    }
    

    public static void main(String[] args) {
      Node a = new Node(7);
      Node b = new Node(5);
      Node c=  new Node(4);
      Node d = new Node(9);
      Node e = new Node(8); 
      a.next = b;
      b.prev = a;
      b.next = c;
      c.prev = b;
      c.next = d;
      d.prev = c;
      d.next = e;
      e.prev = d; 
      e.next = null;
      // display(a);
      // displayreverse(e);
      displayrandom(c);

    }
}
