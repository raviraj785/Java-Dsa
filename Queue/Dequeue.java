import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
         // Add 
         dq.addLast(1);
         dq.addLast(2);
         dq.addLast(1);
         dq.addLast(3);
         dq.addLast(4);
        //  System.out.println(dq);

        //  dq.addFirst(5);
        //  System.out.println(dq);
        //   dq.removeFirst();
        //   System.out.println(dq);
        //   System.out.println(dq.getFirst());
        //   System.out.println(dq.getLast());

        System.out.println(dq);
        dq.add(5); // last add
        dq.remove(); //  First remove
       // dq.removeAll(dq);// remove every thing
        System.out.println(dq);
        dq.removeFirstOccurrence(1);
        dq.removeLastOccurrence(dq);
        System.out.println(dq);
    }
}
