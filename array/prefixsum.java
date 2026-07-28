import java.util.Scanner;

public class prefixsum {
    public static void printarray(int arr[]){
    for(int i = 0 ; i < arr.length ; i++){
       System.out.print(arr[i]+" ");
    }
    System.out.println();
 }
 public static int[] prefixsumm(int arr[]){
    for(int i =1 ; i< arr.length ;i++){
        arr[i]= arr[i] + arr[i-1];
    }
    return arr;
  }
 public static void main(String[] args) {
    
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Size Of array");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter"+ n+" Element");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("ORiginal Array : ");
          printarray(arr);
           int ans [] = prefixsumm(arr);
          System.out.print(" Prefix Sum : ");
          printarray(ans);
       

    }
}

