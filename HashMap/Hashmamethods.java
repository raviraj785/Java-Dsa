/**
 * Hashmamethods
 */
import  java.util.*;
public class Hashmamethods {
    static void hasmap(){
        Map<String , Integer> mp = new HashMap<>();
        // Adding Element
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishka",5);
        mp.put("Harry", 19);
        
        // Getting Value of a key From hashmap
        System.out.println(mp.get("Yash")); // 16
        System.out.println(mp.get("Rahul")); //Null
        //  Changing / Updating Value of a key int the hashmap
        mp.put("Akash", 25);
        System.out.println(mp.get("Akash")); // 25
        System.out.println("Riya"); // null -> JAb riy nhi h to uska value null print karega
        // Checking if a key in the Hashmap
        System.out.println(mp.containsKey("Rishika"));
        System.out.println(mp.containsKey("Divyanshu"));
         // Adding a new Entity only if present 

         mp.putIfAbsent("Yashika", 30);
         mp.putIfAbsent("Yash", 30);

         // Get All keys in the hashmap
         System.out.println(mp.keySet());
          // get all the Value in Hashmap
          System.out.println(mp.values());

        // Get All entity in the Hashmap

        System.out.println(mp.entrySet());


        // Traversing All entries of hashmp - multiple MEthods here 
         // Methods First
         for(String  key : mp.keySet()){
            System.out.printf("Age of %s is %d\n " , key , mp.get(key));
         }
         System.out.println();
          // methods Two
         for(Map.Entry<String , Integer> e : mp.entrySet())
         {
            System.out.printf("Age of %s is % d\n" , e.getKey() , e.getValue());

         }
         System.out.println();
         // Methods Three

         for(var e: mp.entrySet()){
            System.out.printf("Age of %s is % d\n" , e.getKey() , e.getValue());
         }

    }
public static void main(String[] args) {
    hasmap();
}  
}