import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraylisreverse {
    // public static void revrese(ArrayList <Integer>  list){
      
    //     int i = 0;
    //     int j = list.size() -1;

    //     while (i < j) {
    //         Integer temp = Integer.valueOf(list.get(i));
    //         list.set(i, list.get(j));
    //         list.set(j, temp);
    //         i++;
    //         j--;
            
    //     }
    // }
    public static void main(String args[]) {
       
      ArrayList <Integer> l1 = new ArrayList<>();
      
      // add new Element 
      l1.add(5);
      l1.add(6);
      l1.add(7);
      l1.add(8);
      
      System.out.println("Original array : ");
      System.out.println(l1);
      //revrese(l1);
      Collections.reverse(l1);
      System.out.println("Reverse IS " + l1);
      Collections.sort(l1);
      System.out.println("Asending order  Sort " + l1);
      Collections.sort(l1 , Collections.reverseOrder());
      System.out.println(l1);
      
      ArrayList<String> list = new ArrayList<>();
      list.add("Welcome");
      list.add("to");
      list.add("physics");
      list.add("wallaha");
      
      System.out.println("OG " + list);
      Collections.sort(list);
      System.out.println(list);
      
      

}
}
