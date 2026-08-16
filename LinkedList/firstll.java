public class firstll {
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
        // System.out.println(b);
        // System.out.println(a.next.data);
        // System.out.println(c.next.next.next.data);

        // Using Loops

        //  node temp = a ;
        //  for(int i = 1 ; i <= 6; i ++){
        //     System.out.println(temp.data);
        //     temp = temp.next;
        //  }

        //While Loop --> When tail == null mens we are on last Node
        node temp = a;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
