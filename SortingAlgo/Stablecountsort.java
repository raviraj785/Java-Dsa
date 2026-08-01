 class stablecountsort {
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
     static void countsort(int arr[]){
          
          int outpurarray[] = new int[arr.length];
          int max = findmax(arr); // Find The Largest Element OF the Array
          int freq[] = new int[max+1];
          for(int i = 0 ; i < arr.length ; i++){
            freq[arr[i]]++; // find FrequenciArray
          }
          
      

   // Make Prefix Sumarray OF count Array
   for(int i = 1; i < freq.length ; i++){
    freq[i] += freq[i-1];
   }

   // Find The Index OF Each Element In Original Array ANd PUt in OUtpur Array
   for(int i=arr.length-1 ; i >= 0 ; i--){
       int idx = freq[arr[i]] - 1; // Here We get Index OF original array
       outpurarray[idx] = arr[i];
       freq[arr[i]]--;
   }
    //copy All Element 
    for(int i = 0 ; i < arr.length ; i ++){
        arr[i] = outpurarray[i];
    }
}
    public static void main(String[] args) {
        int arr [] = {1,2,3,2,1,3,30};
        System.out.println("Original array ");
        displayarray(arr);

        
        countsort(arr);
        System.out.println("After sorting ");
        displayarray(arr);
    }

}
