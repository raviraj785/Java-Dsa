import java.util.Scanner;
import java.util.Stack;

public class insertionatanyndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        int n ;
        System.out.println("Enter the No of ELelment Yo Want to Insert ");
        n= sc.nextInt();
        System.out.println("Enter Elemnet");
        for(int i = 0 ; i < n ; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        int idx = 2;
        int x = 7;
          Stack<Integer> rt = new Stack<>();
         while (st.size() > idx) {
            rt.push(st.pop());
        }
        st.push(x);
        while (rt.size() > 0) {
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}