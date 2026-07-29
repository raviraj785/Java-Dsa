import java.util.Scanner;

public class medium_apporach_of_calculating_prifixsum {
   public static void printarray(int arr[][]){
        for(int i = 0 ; i< arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " " );
            }
            System.out.println();
        }
     }
     public static int findsum(int arr[][] , int l1, int r2, int l2, int r3){
        int sum =0;
        for(int i =l1 ; i<= l2 ; i++){
            for(int j = r2 ;j <= r3 ; j++){
                sum+=arr[i][j];
            }
        }
        return sum;
     }
     public static void makeprifixsum(int arr[][]){
        
        int r = arr.length;
        int c = arr[0].length;

        for(int i = 0; i < r; i++){
            for(int j = 1;  j < c; j++){
                arr[i][j] += arr[i][j-1];
            }
        }
     }

    public static int findsum2(int arr[][] , int l1, int r2, int l2, int r3){
        int sum =0;
         makeprifixsum(arr);
         for(int i = l1; i <= l2 ; i++){
            if(r2 > 0){
              sum+=arr[i][r3] - arr[i][r2-1];
            }
            else
                sum+=arr[i][r3];
           
         }
         return sum;
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

      
          
       System.out.println("Enter The coordinates : ");{
        int l1 = sc.nextInt();
        int r2 = sc.nextInt();
        int l2 = sc.nextInt();
        int r3  = sc.nextInt();
        System.out.println("Original Array : ");
        printarray(arr);
       
      
        System.out.println(" prefix sum is with brutforce method  :" + findsum(arr, l1, r2, l2, r3));
         System.out.println(" prefix sum is making a prifixsum :" + findsum2(arr, l1, r2, l2, r3));
       
       }
     } 
}
