import java.util.Scanner;

public class rotateTwoDarrayy {
    static void printmatrixarray(int arr[][]){
           for(int i = 0; i<arr.length;i++){
            for(int j= 0 ; j< arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
           }
    }
    static void reversearray(int arr [] ){
        int i = 0 , j= arr.length-1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
     public static void transposematrixx(int arr[][], int r, int c){
       for(int i= 0;i<c;i++){
        for(int j= i; j<r ; j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
       }
     }
       static void rotate(int arr[] [] , int n ){
       transposematrixx(arr, n, n);
       for(int i = 0; i < n ;i++){
               reversearray(arr[i]);
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

        rotate(arr, r);
        System.out.println("Rotation Matrix");
        printmatrixarray(arr);
        
     }
}


