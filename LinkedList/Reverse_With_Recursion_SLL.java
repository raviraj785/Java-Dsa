public class Reverse_With_Recursion_SLL {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static Node reverse(Node head){
        if (head == null || head.next == null ) {
            return head;
        }
            Node newHead = reverse(head.next);
            head.next.next = head; // InterChanging The Conection
            head.next = null;
        
        return newHead;
    }
    public static void dispaly(Node head){
        if (head == null) { // Base Case'
            return;
        }
        // Call
        System.out.print(head.val + " "); // Work
         dispaly(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(6);
        Node d = new Node(9);
        Node e = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
       //  Input :- 3->5->->6->9->10
       // Output :- 10->9->6->5->3
        Node r = reverse(a);
        dispaly(r);
    }

}
