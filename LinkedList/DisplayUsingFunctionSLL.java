public class DisplayUsingFunctionSLL {
    public static void display(node head){
         while (head!=null) {
            System.out.print(head.data + " ");
             head = head.next;
         }
    }
    public static class node {
    
        int data ;
        node next;
         node(int data){
            this.data = data;
         }
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
        display(a);
       
    }
}
