import java.util.Scanner;

public class best_apporach_of_calculating_prifixsum {
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
      public static void makeprifixsumfor2(int arr[][]){
        
        int r = arr.length;
        int c = arr[0].length;

        for(int i = 0; i < r; i++){
            for(int j = 1;  j < c; j++){
                arr[i][j] += arr[i][j-1];
            }
        }
    }
     public static void makeprifixsum3(int arr[][]){
        
        int r = arr.length;
        int c = arr[0].length;

        for(int i = 0; i < r; i++){
            for(int j = 1;  j < c; j++){
                arr[i][j] += arr[i][j-1];
            }
        }
        for(int j = 0; j< c ; j++){
            for(int i = 1; i < r ; i++){
                arr[i][j] += arr[i-1][j];
            }
        }
     }

    public static int findsum2(int arr[][] , int l1, int r2, int l2, int r3){
        int sum =0;
         makeprifixsumfor2(arr);
         for(int i = l1; i <= l2 ; i++){
            if(r2 > 0){
              sum+=arr[i][r3] - arr[i][r2-1];
            }
            else
                sum+=arr[i][r3];
           
         }
         return sum;
    }
    public static int findsum3(int arr[][] , int l1, int r2, int l2, int r3)
     {
        int ans = 0, sum=0,up = 0, left = 0 , leftup =0;
        makeprifixsum3(arr); 
         
        sum = arr[l2][r3];
        if(r2>=1)
        left = arr[l2][r2-1];
    if (l1 >= 1)
        up = arr[l1-1][r3];
    if(l1 >= 1 && r2 >= 1)
        leftup = arr[l1-1][r2-1];
        ans = sum-up-left+leftup;
         

      return ans;

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
       
        // int arr2[][] = new int[r][c];
        // int arr3[][] = new int[r][c];

        // for (int i = 0; i < r; i++) {
        //     for (int j = 0; j < c; j++) {
        //         arr2[i][j] = arr[i][j];
        //         arr3[i][j] = arr[i][j];
        //     }
        // }

      
          
       System.out.println("Enter The coordinates : ");{
        int l1 = sc.nextInt();
        int r2 = sc.nextInt();
        int l2 = sc.nextInt();
        int r3  = sc.nextInt();
        System.out.println("Original Array : ");
        printarray(arr);
       
      
        System.out.println(" prefix sum is with brutforce method  :" + findsum(arr, l1, r2, l2, r3));
        // System.out.println(" prefix sum is making a medium apporach prifixsum :" + findsum2(arr2, l1, r2, l2, r3));
         System.out.println(" prefix sum is making a Best Fucking Apporach prifixsum :" + findsum3(arr, l1, r2, l2, r3));
       
       }
     } 
}
