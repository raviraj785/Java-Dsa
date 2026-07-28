import java.util.Scanner;

public class returnfirstreapitingnumber {
    public static int  firstreapiting (int arr[]) {
          for(int i = 0; i< arr.length ; i++){
            for(int j = i+1; j< arr.length ; j ++){
                if(arr[j]==arr[i]){
                    return arr[i];
                }
            }
          }
          return -1; 
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

       System.out.println(firstreapiting(arr));

    }
}
