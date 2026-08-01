 class UnstablecountSort {
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
     static void simplecount(int arr[]){
          int max = findmax(arr);
          int freq[] = new int[max+1];
          for(int i = 0 ; i < arr.length ; i++){
            freq[arr[i]]++;
          }
          int k = 0 ;
          for(int i = 0 ; i < freq.length ; i++){
            for(int j = 0 ; j < freq[i] ; j ++ ){
                arr[k++] = i ;
            }
          }
     } 


    public static void main(String[] args) {
        int arr [] = {1,2,3,2,1,3,30};
        System.out.println("Original array ");
        displayarray(arr);

        
        simplecount(arr);
        System.out.println("After sorting ");
        displayarray(arr);
    }

}
