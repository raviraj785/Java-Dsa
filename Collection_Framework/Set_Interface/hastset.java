package Set_Interface;

import  java.util.*;

public class hastset {
    public static void main(String[] args) {
        // HashSet<Integer> st = new HashSet<>();
        //LinkedHashSet<Integer> st = new LinkedHashSet<>();
        TreeSet<Integer> st = new TreeSet<>();
        st.add(1);
         st.add(2);
          st.add(3);
           st.add(4);
            st.add(48);
            st.add(15);
            st.add(10);
           System.out.println(st); // 1 2
           st.remove(2);
           System.out.println(st.contains(2));
           System.out.println(st.size());
    }
}
