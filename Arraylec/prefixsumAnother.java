import java.util.Scanner;
public class prefixsumAnother {
    public static void printArray(int [] arr){
        for(int i=0;i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int [] prefixsumm(int [] arr){
     
         for(int i=1;i<arr.length;i++){
            arr[i]= arr[i]+ arr[i-1];
         }
         return arr;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Arrray Size");
        int n = sc.nextInt();
        int arr[]= new int [n];
         
        System.out.print("Enter " + n+ " Element = "+" ");
        for(int i=0;i<arr.length;i++){
          arr[i]= sc.nextInt();
        }

        System.out.println("Input Array "+ " ");
        printArray(arr);
        System.out.println("\n Sum of prefix Is Here"+ " ");
         int [] pref = prefixsumm(arr);
         printArray(pref);
         
    }
}



