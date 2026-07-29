import java.util.Scanner;
public class countthenumberofoccurence {
    
      public static void noofoccurence(int arr[],  int x){
        
        int count = 0;
        for(int i = 0 ;i <arr.length ; i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println(x +" is " +count +" fucking time   in this Arry" );
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
    
        System.out.println("What The fuck You Want To Check No of occurence ");
        int x = sc.nextInt();
        noofoccurence(arr,x);

       

    }
}


