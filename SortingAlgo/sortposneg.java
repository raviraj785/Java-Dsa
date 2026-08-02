public class sortposneg {
    static void displayarray( int arr[]){
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static void sortarray(int arr[]){
        int l = 0 ;
        int r = arr.length-1;
        while (l< r) {
            while (arr[l] < 0 ) {
                l++;
            }
            while (arr[r] >= 0) {
                r--;
            }
        if (l < r) {
             int temp = arr[l];
             arr[l] = arr[r];
             arr[r] = temp;
        }
        }
    }
     public static void main(String[] args) {
        int arr[] = { 1,-3,4,-2,-5,8,9,10};
        sortarray(arr);
         displayarray(arr);
     }
}
