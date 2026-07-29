import java.util.Scanner;

public class secondlargest {
    public static int findmax(int arr[]){
        int mx = Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] > mx){
                mx = arr[i];

            }
        }
        return mx;
    }
    public static int secondmax(int []arr){
        int mx = findmax(arr);
        int n = arr.length;
        for(int i = 0; i< n ; i++){
            if(arr[i]==mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmx = findmax(arr);
        return secondmx;
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
       
         System.out.println(secondmax(arr));
       

    } 
}
