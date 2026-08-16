public class nThnodefromlastSSlWithTwoPOinter {
   
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;

        }
    }
    public static Node nthNode(Node head, int n){
        Node slow = head ;
        Node fast = head;
        for(int i = 1 ; i <= n ; i++){
            fast = fast.next;
        }
        while (fast!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return slow;
    }
     public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(5);
        Node c = new Node(57);
        Node d = new Node(15);
        Node e = new Node(13);
        Node f = new Node(45);
        a.next = b; 
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // 100 -> 5 -> 57->15 -> 13 -> 45
        Node temp = nthNode(a , 3);
        System.out.println(temp.data);
        
     }
}


