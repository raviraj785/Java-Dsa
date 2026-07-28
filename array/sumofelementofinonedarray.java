import java.util.Scanner;

public class sumofelementofinonedarray {
    public static void sumofelement(int arr[]){
         int sum = 0; 
         for(int i = 0; i < arr.length; i++){
            sum+=arr[i];
         }
         System.out.println(sum);
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
        sumofelement(arr);
       

    }
}

