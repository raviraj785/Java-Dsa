import java.util.Scanner;
public class takinginput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size OF AN ARRAY");
        int size = sc.nextInt();
        int arr[]= new int [size];

        System.out.println("Enter "+ size+ " Element");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Printed element");
        for(int i=0;i<=size;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
