import java.util.Stack;

public class basicofstack {
public static void main(String[] args) {
  Stack<Integer> st = new Stack<>();
  System.out.println(st.isEmpty());
  System.out.println("Size is : " + st.size());
  System.out.println(st);
  st.push(8);
  System.out.println("Size is : " + st.size());
  System.out.println(st);
  st.push(1);
    System.out.println("Size is : " + st.size());
  System.out.println(st);
  st.push(90);
  System.out.println("Size is : " + st.size());
  System.out.println(st);
  st.push(84);
      System.out.println("Size is : " + st.size());
  System.out.println(st);
  st.push(64);
  System.out.println(st.isEmpty());
   // peek 

//    System.out.println(st.peek());
//    System.out.println(st);
//    st.pop();
//    System.out.println(st.peek());
//    System.out.println("Size is : " + st.size());
//    while (st.size() > 2) {
//     st.pop();
//    }
//     System.out.println(st.peek());
//     System.out.println(st);
  }
}
