import java.util.Scanner;

public class reverseanother{
    public static void printarray(int arr[]){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void swap(int arr[], int i , int j ){
        int temp = arr[i];
         arr[i] = arr[j];
        arr[j] = temp;
        
    }
    public static void reversearray(int arr[]){
        int i = 0 ; 
        int j = arr.length-1;
        while ( i< j) {
            swap(arr,i,j);
            i++;
            j--;
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
       
        reversearray(arr);
        System.out.println("Reverse Array IS ");
        printarray(arr);
       

    }
}