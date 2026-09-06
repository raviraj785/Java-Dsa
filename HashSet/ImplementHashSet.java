import java.util.HashSet;

public class ImplementHashSet {

     public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("Jemes");
        st.add("Scott");
        st.add("Jemes");
        System.out.println(st);
        System.out.println(st.contains("Jemes"));
        System.out.println(st.size());
        st.remove("Jemes");
        System.out.println(st.contains("Jemes"));
        System.out.println(st.size());
        System.out.println("Mark");
        for(String s : st){
            System.out.println(s);
        }
     }
}