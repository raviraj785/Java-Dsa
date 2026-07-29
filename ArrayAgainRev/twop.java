import java.util.Scanner;

public class twop {
    
    public static void printarray(int arr[]){
        for(int i = 0 ;i< arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void swap(int arr[], int i , int j ){
        int temp = arr[i];
         arr[i] = arr[j];
        arr[j] = temp;
        
    }
    public static void zeroonesort(int arr[]){
        int n= arr.length;
        int zeroes =0;
        // count the no of zero
        for(int i =0; i< n ; i++){
            if(arr[i] == 0){
                zeroes++;
            }
        }
        for(int i =0; i< n ;i++){
            if(i< zeroes){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of array");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter"+ n+" Element");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
     
         System.out.println("Original Array ");
         printarray(arr);
         zeroonesort(arr);
         System.out.println("Sorted Arry");
         printarray(arr);
       

    }
}

