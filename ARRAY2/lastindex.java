
import java.util.Scanner;
public class lastindex {
        public static int  lastOccurence(int []arr ,int x){
            int lastindex =-1;
            for(int i=1;i<arr.length;i++){
                if(arr[i]==x){
                    lastindex =i;
                }
            }
            return lastindex;
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
        
        // System.out.println("Count of X " + couunt(arr ,x ));
         System.out.println("last occurene  of X " + lastOccurence(arr ,x ));
    }
    
}



