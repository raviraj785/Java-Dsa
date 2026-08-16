public class DisplayUsingRecursionSLL {
    public static void display(node head){
         if (head == null) {
            return;
         }
            // System.out.print(head.data + " "); 5->6->7->8->9->10
            display(head.next);
               System.out.print(head.data + " ");//10->9 -> 8->7->6->5  ye ulta isliye huaa kyuki ja dispaly(head.net) wala fuction complete hoga to jo sabse uper call stack me values rahega wahi se print hona suru hona suru hoga pahle pura display() chalge then ek ek kerke sout hoga uper se values
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
