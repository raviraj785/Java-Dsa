

import java.util.Scanner;
public class returnfirstvalue {
    public static int firstreapitingnum(int []arr ){
        int n= arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]==arr[i]){
                    return arr[i];
                }
            }
        }
        return -1;
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
         System.out.println(" first Value That can reapeat in this arrray  " + firstreapitingnum(arr));
    }
    
}



