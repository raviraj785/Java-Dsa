import java.util.Scanner;

public class targetsum {
    public static int targetsum(int arr[], int x){
        int ans = 0;
         for(int i = 0; i< arr.length ; i++){
            for(int j = i+1; j< arr.length;j++){
               if ( arr[i] + arr[j] == x ) {
                 ans++;
               }
            }
         }
         return ans;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter The Size Of array");
         int n = sc.nextInt();
         int arr[] = new int[n];

         System.out.println("enter "+ n + "Element");
         for(int i = 0; i< n ; i++){
            arr[i] = sc.nextInt();

         }
         System.out.println("Enter The Target Element");
         int x = sc.nextInt();
 
          System.out.println(targetsum(arr, x));
    }
}
