import java.util.Scanner;

public class rootatearrayktimes {
    public static void printarray(int arr[]){
        for(int i = 0 ;i< arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static int [] rotatekt(int arr[] , int k){
        int n = arr.length;
         k= k%n;
        int ans [] = new int[n];
        int j = 0;

        for(int i =n-k ; i <n ;i++){
            ans[j++] = arr[i];
        }
        for(int i = 0 ; i < n-k-1; i ++){
            ans[j++] = arr[i];
        }
        return ans;
    
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
         int ans [] = rotatekt(arr, k);
        System.out.println("Roteted array is ");
        printarray(ans);
    }
}
