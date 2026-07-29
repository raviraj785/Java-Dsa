

import java.util.Scanner;
public class uniqueFind {
        public static int  uniqueFindd(int []arr ){
            int ans =0;
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                arr[i]=-1;
                arr[j]=-1;
            }
        }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans =arr[i];
            }
        }
        return ans;
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
        
        System.out.println("Unique Numbers  " + uniqueFindd(arr ));
    }
    
}



