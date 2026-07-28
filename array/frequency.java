import java.util.Scanner;

public class frequency {

    public static int [] makefrequencyarray(int arr[]){
        int [] freq = new int[100005];
        for(int i = 0; i< arr.length; i++ ){
            freq[arr[i]]++;
        }
        return freq;
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

        int [] freq = makefrequencyarray(arr);
        System.out.println("Enter No Of Quiery");
        int q = sc.nextInt();
       while (q > 0) {
         System.out.println("Enter The Searched array");
         int x = sc.nextInt();
         if(freq [x] > 0){
            System.out.println("Yes");
         }
         else
            System.out.println("NO");
        q--;
       }
       

    }
}
