import java.util.Scanner;

public class multiplyarray {
   public static void printarray(int arr[][]){
        for(int i = 0 ; i< arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " " );
            }
            System.out.println();
        }
     }
     public static void  multiply(int arr[][] , int r, int c , int arr1 [][], int r1, int c1){
        if(c!=r1){
          System.out.println("Wromg Input ");
          return;
        }
        int multi [][]  = new int[r][c1];
        for(int i = 0; i < r ; i++){
            for(int j = 0 ; j < c1; j++){
                for(int k = 0 ; k < c ; k++)
                multi[i][j] += arr[i][k] * arr1[k][j];
            }
        }
        System.out.println("Multiply  Matrix : ");
        printarray(multi);
     }
      
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      System.out.println("Enter The  Row and column Of 1st array");
        System.out.println("Enter No of Row ");
        int r = sc.nextInt();

        System.out.println("Enter No Of column : ");
        int c = sc.nextInt();

        int arr[][] = new int [r][c];

        System.out.println("Enter " + (r*c) + " element");
        for(int i = 0; i< r ;i++){
            for(int j = 0 ; j < c ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

       System.out.println("Enter The  Row and column Of 2nd array");
        System.out.println("Enter No of Row ");
        int r1 = sc.nextInt();

        System.out.println("Enter No Of column : ");
        int c1 = sc.nextInt();

        int arr1[][] = new int [r1][c1];

        System.out.println("Enter " + (r1*c1) + " element");
        for(int i = 0; i< r1 ;i++){
            for(int j = 0 ; j < c1 ; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
          
        System.out.println(" ORiginal Element Of 1st array ");
        printarray(arr);

        System.out.println(" ORiginal Element Of 2nd array ");
        printarray(arr1);
        
        multiply(arr, r, c, arr1, r1, c1);
     } 
}
