public class insertionsort {
    static void insertionsortt(int arr[]){
        int n= arr.length;

        for(int i = 1; i < n ; i ++){
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]) {
                int temp = arr[j];
                arr[j] =  arr[j-1];
                arr[j-1] = temp;
                j--; 
            }
           
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,6,8,7,2,3,4,5,8};
        insertionsortt(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
