public class dutchsorting {
      static void displayarray(int arr[]){
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
      }
      static void swap(int []arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

      }
      static void sort012(int arr[]){
        int low = 0 ; 
        int mid = 0 ;
        int high = arr.length-1 ;

        while (mid <= high) {
            if (arr[mid] == 0 ) {
                swap(arr, mid, low);
                mid++;
                low++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else{
                  swap(arr, mid, high); 
                  high--;               
              }
            }
        }

       
      
    public static void main(String[] args) {
      int arr [] = { 1,2,0,0,2,0,2,1 } ;   
    displayarray(arr);
    sort012(arr);
    displayarray(arr);
    }

}