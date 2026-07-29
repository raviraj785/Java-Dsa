import java.util.Scanner;

public class reversearray {
    public static void printarray(int arr[]){
        for(int i = 0; i< arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int []  reverseearray(int arr[]){
        int n = arr.length;
        int ans [] = new int[n];
        int j = 0;
        for(int i =n -1; i>=0 ; i-- ){
            ans[j] = arr[i];
            j++;
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

     int answer []= reverseearray(arr);
     printarray(answer);
    }
}
