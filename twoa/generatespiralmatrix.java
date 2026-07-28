import java.util.Scanner;

public class generatespiralmatrix {
     
    public static void printarray(int arr[][]){
        for(int i = 0 ; i< arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " " );
            }
            System.out.println();
        }
     }
    
     public static int[][] printspiralmatrix(int n ){
 
        int [][] arr = new int[n][n];
       int toprow = 0,  bottomrow = n-1;
        int leftcol = 0, rightcol = n-1; 
        int curret=1;

        while (curret <= n * n) {
              
            //toprow -> leftcol to rightcol
            
            for(int j = leftcol ; j <= rightcol && curret <= n * n ; j++ ){
                arr[toprow][j] = curret ++ ;
            }
            toprow ++;

            // rightcol -> toprow to bottomrow
         
            for(int i = toprow ; i <= bottomrow && curret <= n * n ; i++){
                arr[i][rightcol] = curret ++ ;
            }
            rightcol--;

            // bottomrow -> rightcol to left col
            
            for(int j = rightcol ; j >= leftcol  && curret <= n*n; j--){
                 arr[bottomrow][j] = curret ++;
            }
            bottomrow --;

            // leftcol -> bottomrow to  toprow
            for(int i= bottomrow ; i >= toprow && curret <=n*n ; i--){
               arr[i][leftcol] = curret ++;
            }
            leftcol ++;

        }
        return arr;
    


     }


     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N ");
        int n = sc.nextInt();
        int  [][] ans = printspiralmatrix(n);
        printarray(ans);
     }

}
