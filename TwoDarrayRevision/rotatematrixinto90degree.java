import java.util.Scanner;
public class rotatematrixinto90degree {
    


    public static void printarray(int arr[][]){
        for(int i = 0 ; i< arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " " );
            }
            System.out.println();
        }
     }
   
 public static void reverse(int arr[]){
    int i = 0; 
    int j = arr.length -1;
    while (i < j) {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         i++;
         j--;
    }
 }

      public static void transposeinplace(int [][] arr , int r , int c ){
        if (r != c) {
        System.out.println("In-place transpose is possible only for square matrices.");
         return;
}
        for(int i = 0 ; i < r ; i++){
            for(int j = i ; j < c ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
     }

     public static void rotate(int arr[][] , int r ,int  c){
       // here the matrix get transpose
       transposeinplace(arr, r, c);
        // now the turn of reverse
        for(int i = 0 ; i < arr.length; i++){
         reverse(arr[i]);
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
        System.out.println(" ORiginal Element Of 1st array ");
        printarray(arr);
        
        //  transposeinplace(arr, r, c);
        //   System.out.println("Now its Fucking Time To Print Transpose Materix : ");
        // printarray(arr);
     
    
        rotate(arr, r, c);
        System.out.println("Roteted Array Is : ");
        printarray(arr);
        
        
     }
}


