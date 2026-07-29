import java.util.Scanner;

public class greaterthanoutofelement {
    public static void greater(int arr[]){
        int ans = 0;
         for( int i =0 ; i< arr.length; i++){
            if(arr[i]> ans){
                ans = arr[i];
            }
           
         }
          System.out.println(ans);
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
        greater(arr);
       

    }
}
