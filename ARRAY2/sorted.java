
import java.util.Scanner;
public class sorted {
        public static boolean sortted(int []arr){
         boolean check =true;
            for(int i=1;i<arr.length;i++){
                if(arr[i] < arr[i-1]){
                    check=false;
                    break;
                }
            }
         return check;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size OF AN ARRAY");
        int size = sc.nextInt();
        int arr[]= new int [size];

        System.out.print("Enter "+ size+ " Element");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // System.out.println("Enter X ");
        // int x= sc.nextInt();
        
        // System.out.println("Count of X " + couunt(arr ,x ));
        // System.out.println("Strictly grater the  X " + graeter(arr ,x ));
         System.out.println("Is sorted : " + sortted(arr));
    }
    
}




