import java.util.Scanner;

public class finduniq {
    public static void uniqfind(int [] arr){
        int ans = 0;
        for(int i = 0; i<arr.length ; i++){
            for(int j =i+1; j<arr.length; j++){
                if (arr[i]== arr[j]) {
                    arr[i]=-1;
                    arr[j] =-1;

                }
            }
        }
    
        for(int i =0 ; i < arr.length ;i++){
            if (arr[i] > 0) {
                ans = arr[i];

            }
        }
        System.out.println("Unique Number Is :  "+ans);
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
         uniqfind(arr);
   }
}

