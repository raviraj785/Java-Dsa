import java.util.Scanner;

public class transposematrixwithournewarray {
    static void printmatrixarray(int arr[][]){
           for(int i = 0; i<arr.length;i++){
            for(int j= 0 ; j< arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
           }
    }
     public static void transposematrixx(int arr[][], int r, int c){
       for(int i= 0;i<r;i++){
        for(int j= i; j<c ; j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
       }
     }
       
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No Of Row ");
        int r= sc.nextInt();
        System.out.println("Enter The No Of Column ");
        int c= sc.nextInt();
        int [][] arr = new int[r][c];
        System.out.println("Enter "+ r*c+ " Matrix Element");
        for(int i= 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Array");
        printmatrixarray(arr);

        System.out.println("TransPose Array");
       transposematrixx(arr, r, c);
               printmatrixarray(arr);

        
     }
}

