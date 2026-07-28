public class maximumingivenarray {
      public static int maxinarray( int arr [] , int idx){
           // base conndition 

        if ( idx == arr.length - 1) return arr[idx] ;

         // small problem 
        
         int smallans = maxinarray(arr, idx + 1);
          
         //return Math.max(smallans, arr[idx]);
         
          return smallans + arr[idx];


      }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(maxinarray(arr, 0));
    }
}
