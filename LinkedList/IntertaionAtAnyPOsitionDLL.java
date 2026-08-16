public class IntertaionAtAnyPOsitionDLL {
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
 
    public static void inserAtAnypos(Node head , int idx , int val){
      Node s= head;
      for(int i = 0 ; i < idx ; i++){
        s = s.next;
      }
       //S is at idx-1 position
      Node r = s.next;
      Node t = new Node(val);
      s.next = t;
      t.prev = s;
      t.next = r;
      r.prev = t;
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
       display(a);
      // displayreverse(e); 
      
      display(a);
      inserAtAnypos(a, 3, 56);
      display(a);

    }
}
