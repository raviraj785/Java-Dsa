 class RadixSort  {
    static void displayarray(int arr[]) {
        for(int i  : arr){
              System.out.print(i + " ");
        }
        System.out.println();

    }
     static int findmax(int arr[]){
        int mx = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
           if (arr[i] > mx) {
            mx = arr[i];
           }
        }
        return mx;
     }
     static void countsort(int arr[] ,int palace){
          
          int outpurarray[] = new int[arr.length];
          
          int freq[] = new int[10];
          for(int i = 0 ; i < arr.length ; i++){
            freq[(arr[i] / palace) % 10 ]++; // MAke FrequenciArray   ,if palace 1's hai to  arr[i] = 105 ; freq[5]++ , agar palce 10's hai to freq[0] ++ karna hain ;

          }
    

   // Make Prefix Sumarray OF count Array
   for(int i = 1; i < freq.length ; i++){
    freq[i] += freq[i-1];
   }

   for(int i=arr.length-1 ; i >= 0 ; i--){
       int idx = freq[(arr[i] / palace ) % 10 ] - 1; // Here We get Index OF original array
       outpurarray[idx] = arr[i];
       freq[(arr[i] / palace) % 10 ]--;
   }
    //copy All Element 
    for(int i = 0 ; i < arr.length ; i ++){
        arr[i] = outpurarray[i];
    }
}

          static void radixsortt( int arr[]){
            int mx =findmax(arr); //get maximum Value 
             //Apply count sort to Sort Elemnt Based On palace Value
               for(int palace = 1 ; mx/palace > 0 ; palace *=10){
                countsort(arr , palace);
               }
          }
    public static void main(String[] args) {
        int arr [] = {1,2,3,48,2,1,3,30};
        System.out.println("Original array ");
        displayarray(arr);

        
        radixsortt( arr);
        System.out.println("After sorting ");
        displayarray(arr);
    }

}
