import java.util.ArrayList;

public class ArrayListt {
    public static void main(String[] args) {
        //wrapper classes
        // Integer in = Integer.valueOf(4);
        // System.out.println(in);
        // Float f = Float.valueOf(4.5f);
        // System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<>();

        // add new element
        l1.add(5); // 5
        l1.add(6); // 5 6
        l1.add(7); // 5 6 7

        // get an element at index i
        System.out.println(l1.get(1)); // 6

        // // print with for loop
        // for(int i = 0; i < l1.size(); i++){
        //     System.out.println(l1.get(i)); // 5, 6, 7, 8
        // }

        //printing the array list directly
        System.out.println(l1); // [5, 6, 7]

        //adding element at some index i
        l1.add(1, 100);  // ✅ FIXED (removed: index: element:)
        System.out.println(l1); // [5, 100, 6, 7]

        //modifying element at index i
        l1.set(1, 10);
        System.out.println(l1); // [5, 10, 6, 7]

        //removing an element at index i
        l1.remove(1);  // ✅ FIXED (removed: index:)
        System.out.println(l1); // [5, 6, 7]

        //removing an element e
        l1.remove(Integer.valueOf(7));  // ✅ FIXED (removed: i:)
        System.out.println(l1); // [5, 6]

        //checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(60));  // ✅ FIXED (removed: i:)
        System.out.println(ans); // false

        // if you don't specify class, you can put anything inside l
        ArrayList l = new ArrayList();
        l.add("pages");
        l.add(1);
        l.add(true);
        System.out.println(l); // [pages, 1, true]
    }
}