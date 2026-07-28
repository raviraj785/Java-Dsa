import java.util.Scanner;
public class strictlygreaterelement {
    
      public static void greaterelement(int arr[],  int x){
        
        int greater = 0;
        for(int i = 0 ;i <arr.length ; i++){
            if(arr[i] > x){
                greater++;
            }
        }
        System.out.println( greater + " elements Is Strictly greater Than "+ x);
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
        greaterelement(arr, x);

       

    }
}



