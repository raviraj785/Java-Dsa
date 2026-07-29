
import java.util.ArrayList;

public class firstarraylist {
    
    public static void main(String args[]) {
       
      ArrayList <Integer> l1 = new ArrayList<>();
      
      // add new Element 
      l1.add(5);
      l1.add(6);
      l1.add(7);
      l1.add(8);

      // Get An Element  of Index i
       System.out.println(l1.get(0));
      // print with for loop
        
      for(int i = 0 ; i < l1.size(); i ++){
        System.out.print(l1.get(i) + " ");
      }
      // Print array list directly Without any loop 
      
      System.out.println(l1);

      //  add element at any index
       
      l1.add(1,100);

      System.out.println(l1);
        
      // modified element at  any index 
      l1.set(1, 10);
      System.out.println(l1);
      // revmove an element  e
      l1.remove(1);
      System.out.println(l1);

      // removing an Element E 
      l1.remove(Integer.valueOf(8));
      System.out.println(l1);
     
      // check if element Exist 
        boolean ans  = l1.contains(Integer.valueOf(60));
       System.out.println(ans);

       // if you dont specify class , you can put any thinng inside else

        ArrayList  l = new ArrayList();
        l.add("Raviraj ");
        l.add(785);
       System.out.println(l);


    }
}
