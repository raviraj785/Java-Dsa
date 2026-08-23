import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {

    public static void pushAtBottom(Stack<Integer> st, int x) {
        if (st.size() == 0) {
            st.push(x);
            return;
        }

        int top = st.pop();

        pushAtBottom(st, x);

        st.push(top);
    }

    public static void reverse(Stack<Integer> st) {
        if (st.size() == 1) {
            return;
        }

        int top = st.pop();

        reverse(st);

        pushAtBottom(st, top);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }

        System.out.println("Original Stack: " + st);

        reverse(st);

        System.out.println("Reversed Stack: " + st);

        sc.close();
    }
}