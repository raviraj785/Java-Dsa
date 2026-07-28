

import java.util.Scanner;
public class secondlargest {
        public static int  findmax(int []arr ){
            int mx =Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
               if(arr[i] > mx){
                mx = arr[i];
               }
            }
            return mx;
        }
        static int findsecondmax(int [] arr){
            int mx = findmax(arr);
            int n = arr.length;
            for(int i= 0;i<n;i++){
                if(arr[i]==mx){
                    arr[i]=Integer.MIN_VALUE;
                }
            }
            int secondmax = findmax(arr);
            return secondmax;
        }
    
            
        

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size OF AN ARRAY");
        int size = sc.nextInt();
        int arr[]= new int [size];

        System.out.println("Enter "+ size+ " Element");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // System.out.println("Enter X ");
        // int x= sc.nextInt();
        
        //System.out.println(" Second Largest  " + findsecondmax(arr));
         System.out.println(" zfirst  Largest  " + findmax(arr));
    }
    
}



