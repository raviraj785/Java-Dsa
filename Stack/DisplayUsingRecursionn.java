import java.util.Scanner;
import java.util.Stack;

public class DisplayUsingRecursionn {
   
    public static void displayrevrec(Stack<Integer> st){
        if (st.size() == 0) {
            return;
        }
        int top = st.pop();
        // Reverse order -> 5 4 3 2 1
        System.out.print(top + " ");
        displayrevrec(st);
        st.push(top);
        // correct order -> 1 2 3 4 5
         System.out.print(top + " ");
    }

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

      displayrevrec(st);
    }
}