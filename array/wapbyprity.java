import java.util.Scanner;

public class wapbyprity {
   
    public static void printarray(int arr[]){
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void swap(int arr [] , int i , int j){
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void twopointerr(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while (left < right ) {
            if (arr[left] % 2== 1 && arr[right] %2 == 0 ){
                swap(arr, left, right);
                left++;
                right --;
            }
            if (arr[left] % 2==0){
                left++;
            }
            if (arr[right] % 2 ==1) {
                right--;
            }
        }
       

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of array");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter "+ n+" Element");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
     
         System.out.println("Original Array ");
         printarray(arr);
         twopointerr(arr);
         System.out.println("Sorted Arry");
         printarray(arr);
}
} 

