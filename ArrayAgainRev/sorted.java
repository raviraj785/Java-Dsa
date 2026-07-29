import java.util.Scanner;
public class sorted {
    
      public static boolean so(int arr[]){
        
       boolean Check = true;
        for(int i = 1 ;i <arr.length ; i++){
            if(arr[i]< arr[i-1]){
                Check = false;
                break;
            }
        }
        return Check;
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
         System.out.println(so(arr));
       
       

    }
}


    