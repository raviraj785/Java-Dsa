import java.util.ArrayList;

/**
 * ArrayListEg
 */
public class ArrayListEg {
       static void ArrayListExample(){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
         System.out.println(arr);
         System.out.println(arr.get(2));
         arr.set(1, 5);
         System.out.println(arr);
         System.out.println(arr.contains(3));
       }
    public static void main(String[] args) {
        ArrayListExample();
    }
    
}
