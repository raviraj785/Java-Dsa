import java.util.Scanner;

public class reverseinplace {
    public static void printarray(int arr[]){
        for(int i = 0 ;i< arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void swap(int arr[], int i , int j ){
        int temp = arr[i];
         arr[i] = arr[j];
        arr[j] = temp;
        
    }
    public static void reversearray(int arr[] , int i ,int j ){
        
        while ( i< j) {
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    public static void rotateinplace(int arr[], int k ){
        int n= arr.length;
        k = k %n;
        reversearray(arr, 0 , n-k-1);
        reversearray(arr, n-k, n-1);
        reversearray(arr, 0, n-1);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of array");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter"+ n+" Element");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Value Of K");
        int k = sc.nextInt();
         
        System.out.println("Original Array is ");
        printarray(arr);
        rotateinplace(arr, k);
        System.out.println("Roteted Array ");
        printarray(arr);
    }
}
