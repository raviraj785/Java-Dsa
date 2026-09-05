import java.util.*;

public class FindMostFrequentElement {
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,3,4,1,1,2,3,4,5,6,7,8};
        Map<Integer , Integer> freq = new HashMap<>();
           
        for(Integer e : arr){
          if (!(freq.containsKey(e))) {
            freq.put(e, 1);
          }
          else{
            freq.put(e, freq.get(e) +1);
          }
        }
        System.out.print("Frequncy Array : ");
         System.out.println(freq.entrySet());
        
         // Traverse the freq

        
         int mxfrqu = 0 , anskey = -1;
         for(var e : freq.entrySet() ){
            if (e.getValue() > mxfrqu) {
                mxfrqu = e.getValue();
                anskey = e.getKey();
            }
         }
          System.out.printf("%d Has Max Frequncy and it Occure %d times  \n" ,anskey ,mxfrqu);
         for(var key : freq.keySet()){
          if (freq.get(key) > mxfrqu) {
            mxfrqu = freq.get(key);
            anskey = key;
          }
         }
         System.out.printf("%d Has Max Frequncy and it Occure %d times  " ,anskey ,mxfrqu);

    }
}
