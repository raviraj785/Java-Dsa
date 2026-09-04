package Queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * queueinterface
 */
public class priorityqueue {
    static  void priorityqueuee (){
        //PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min PQ
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
 
   
    public static void main(String[] args) {
      priorityqueuee();
    }
    
}
