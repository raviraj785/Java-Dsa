public class selectionsort {
    static void selectionsortt(int arr[]){
        int n = arr.length;

        for(int i = 0; i < n-1 ; i++){
            int min_idx = i;
            for(int j = i+1 ; j < n ; j++){
                 if(arr[j] < arr[min_idx]){
                    min_idx = j ;
                 }
                 
            }
            int temp  = arr[min_idx];
                 arr[min_idx] = arr[i];
                 arr[i] = temp;
        }
    }
    public static void main(String[] args) {
         int arr[] = {9,3,2,4,1,4};
         selectionsortt(arr);
         for(int i : arr){
            System.out.print(i+" ");
         }
    }
}
