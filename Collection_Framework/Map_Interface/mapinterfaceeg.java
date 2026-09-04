
package Map_Interface;
import java.util.*;;
public class mapinterfaceeg {
    public static void main(String[] args) {
        // Map<Integer , String> mp = new HashMap<>(); 
        //  Map<Integer , String> mp = new LinkedHashMap<>();
         TreeMap<Integer , String> mp = new TreeMap<>();  
        mp.put(3, "Raviraj");
        mp.put(1, "Rohan");
        mp.put(2, "Riya");
        // System.out.println(mp);
        // System.out.println(mp.containsKey(3));
        // System.out.println(mp.containsValue("Ravraj"));
        // mp.putIfAbsent(1, "Priya");
        // System.out.println(mp);
        // System.out.println(mp.entrySet());
        // System.out.println(mp.keySet());
        // System.out.println(mp.values());
        
        // Itrating Over Key in map
        for(Integer i : mp.keySet()){
            System.out.println(i);
        }
        for(String i : mp.values()){
            System.out.println(i);
        }
         for(var i : mp.entrySet()){
            System.out.println(i);
            System.out.println(i.getKey());
            System.out.println(i.getValue());
         }
    }
}
