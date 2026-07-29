import java.util.Scanner;

public class spiralmatrix {
    public static void printarray(int arr[][]){
        for(int i = 0 ; i< arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " " );
            }
            System.out.println();
        }
     }

  public static void printspiralmatrix(int [][] arr , int r, int c){
    int toprow = 0,  bottomrow = r-1;
    int leftcol = 0, rightcol = c-1;
    int totlelement =0;
    while ( totlelement < r * c ) {
         // top row-> leftcol to rightcol 

         for(int j = leftcol ; j <= rightcol &&  totlelement < r * c ; j++){
            System.out.print(arr[toprow][j] + " ");
            totlelement++;
         }
         toprow ++;

         // rightcol -> toprow to bottomrow
           for(int i = toprow; i <=bottomrow  &&  totlelement < r * c ; i++ ){
            System.out.print(arr[i][rightcol] + " ");
            totlelement++;
           }
          rightcol--;
         // bottomrow -> rightcolumn to leftco
         for(int j = rightcol ; j >= leftcol  &&  totlelement < r * c ; j--){
            System.out.print(arr[bottomrow][j] + " ");
            totlelement++;
         }
          bottomrow --;
        //  leftcol -> bottomrow to toprow
        for(int i = bottomrow; i >= toprow  &&  totlelement < r * c  ; i--){
            System.out.print(arr[i][leftcol] + " ");
            totlelement++;
        }
        leftcol++;
    }
  }

     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      
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
       System.out.println("Original Array ");
        printarray(arr);
        System.out.println("Spiral matrix IS : ");
        printspiralmatrix(arr, r, c);
        
       
}
}