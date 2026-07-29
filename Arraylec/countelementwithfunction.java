
import java.util.Scanner;
public class countelementwithfunction {
        public static int  couunt(int []arr ,int x){
            int count =0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==x){
                    count++;
                }
            }
            return count;
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
        System.out.println("Enter X ");
        int x= sc.nextInt();
        
        System.out.println("Count of X " + couunt(arr ,x ));
    }
    
}


