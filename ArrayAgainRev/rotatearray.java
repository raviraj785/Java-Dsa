import java.util.Scanner;

public class rotatearray {
    public static void printarr(int arr[]){
        for(int i =0; i< arr.length ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] rotate(int  arr[]){
        int ans[] =new int[arr.length];
        int j = 0;
        for(int i = arr.length-1; i >= 0 ; i--){
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

       int answer [] = rotate(arr);
       System.out.println("Rotate Array ");
       printarr(answer);

    }
}
