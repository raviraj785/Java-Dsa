package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    static  void dequeeeg(){
        Deque <Integer> d = new  ArrayDeque<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addLast(3);
        d.addLast(4);
        System.out.println(d);
        System.out.println(d.pollFirst());
        System.out.println(d);
    }
    public static void main(String[] args) {
        dequeeeg();
    }
}
