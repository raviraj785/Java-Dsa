import java.util.Scanner;
public class prefixsyffixsumarray {
    public static int findarray(int [] arr){
        int totalsum =0;
        for(int i=0;i<arr.length;i++){
            totalsum +=arr[i];
        }
        return totalsum;
    }

    public static boolean equalsumpartition(int [] arr){
        int totalsum = findarray(arr);
        int prefsum =0;
        for(int i= 0;i<arr.length;i++){
            prefsum+=arr[i];
            int suffixsum = totalsum -prefsum;
            if(suffixsum==prefsum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENter the Array Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter "+n+ " Element");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println( "Equal partition Sum Is : "+ equalsumpartition(arr));
    }
    
}
