import java.util.Scanner;
import java.util.Stack;

public class copystack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        int n ;
        System.out.println("Enter the No of ELelment Yo Want to Insert ");
        n= sc.nextInt();
        System.out.println("Enter Elemnet");
        for(int i = 1 ; i < n ; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
         // revrse Order 
         Stack<Integer> rt = new Stack<>();
         while (st.size() > 0 ) {
            int x = st.peek();
            //  rt.push(x);
            // st.pop();
            rt.push(st.pop());
            
         }
         System.out.println(rt);
         // corect order
         
         Stack<Integer>ct = new Stack<>();
         while (rt.size() > 0 ) {
            ct.push(rt.pop());
         }
         System.out.println(ct);
         
    }

}
