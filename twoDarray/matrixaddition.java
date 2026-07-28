import java.util.Scanner;

public class matrixaddition {

    public static void printmatrix(int arr[][]){
        for(int i = 0; i< arr.length ;i++){
            for(int j = 0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void add(int a[][],int r1, int c1 ,int b[][] , int r2 ,int c2){
       
        int sum [][] = new int[r1][c1];
        for(int i = 0; i<r1 ;i++){
            for(int j = 0; j<c1 ; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printmatrix(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The No of Row Of First Matrix ");
        int r1 = sc.nextInt();
        System.out.println("Enter The No of column ");
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        System.out.println("Enter The " + r1*c1+ " Elements");
        for(int i= 0;i<r1 ;i++){
            for(int j= 0; j<c1 ;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter The No of Row Of Second Matrix ");
        int r2 = sc.nextInt();
        System.out.println("Enter The No of column ");
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        System.out.println("Enter The " + r1*c1+ " Elements");
        for(int i= 0;i<r1 ;i++){
            for(int j= 0; j<c1 ;j++){
                b[i][j] = sc.nextInt();
            }
        }


      System.out.println("Matrix One ");
      printmatrix(a);
      System.out.println("Matrix Second");
      printmatrix(b);

      System.out.println("Addition Matrix Is : ");
      add(a, r1, c1, b, r2, c2)2
      
    }
}
