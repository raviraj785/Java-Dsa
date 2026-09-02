import java.util.Stack;

public class StackEg {
    static void Stackk(){
        Stack<String> st = new Stack<>();
        st.push("pw");
        st.push("Skill");
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.empty());

    }
    public static void main(String[] args) {
      Stackk();
    }
}
