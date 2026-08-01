import java.util.ArrayList;

import java.util.Collections;

public class bucketsort {

    static void bucketsort(float [] arr){
         int n = arr.length;
         //Bucket 
         // int [] a = new int[5];
         // Hame Array list banana hoga kyuki yaha two d array bucket me dalna h to arraylist se aasan hoga add karna aur get karna 
         ArrayList<Float> [] buckets = new ArrayList[n];
         // Create A Empty Buckets 
         for(int i = 0 ; i < n ; i ++){
            buckets[i] = new ArrayList<Float>();
         }
         // add Element into particular bucket 
          for(int i = 0 ; i < n ; i++ ){
            int bucketidx = (int) (arr[i] * n);
            buckets[bucketidx].add(arr[i]);
          }
           // Sort Each Bucket Indivisually
           for(int i = 0 ; i< buckets.length ; i++){
               Collections.sort(buckets[i]);
           }
           //merge All bucket Get Final sorted Array
           int Index= 0; 
           for(int i = 0 ; i < buckets.length ; i++){
               ArrayList<Float> currBucket = buckets[i];

               for(int j = 0 ; j < currBucket.size(); j++){
                arr[Index++] = currBucket.get(j);
               }
           }
    }
    public static void main(String[] args) {
        float [] arr = {0.5f, 0.4f ,0.3f, 0.2f , 0.1f};
        System.out.println("Original Arrays");

         for(float val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.println("Sorted Arrays ");
        bucketsort(arr);
        for(float val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
