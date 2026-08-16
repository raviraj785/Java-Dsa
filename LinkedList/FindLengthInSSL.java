public class FindLengthInSSL {
   
    
    public static class node {
    
        int data ;
        node next;
         node(int data){
            this.data = data;
         }
    }
    public static int length(node head){
       int count = 0 ;
       while (head!=null) {
          count++;
          head = head.next;
       }
       return count;
    }
    public static void main(String[] args) {
        node a = new node(5);
        node b = new node(6);
        node c = new node(7);
        node d = new node(8);
        node e = new node(9);
        node f = new node(10);
        a.next = b;
        b.next = c;
        c.next =d;
        d.next =e;
        e.next = f;
        System.out.println(length(a));
       
    }
}
