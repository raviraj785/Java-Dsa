import java.util.Scanner;

public class searchelemnt {
    public static void search(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The value of x ");
        int x = sc.nextInt();
        int ans = -1;
        for(int i = 0 ; i< arr.length ; i++){
            if (arr[i]== x){
                ans = i;
                
}
        }

        if(ans == -1){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println(x + " found As Index " + ans );
        }
        
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of array");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.print("Enter"+ n+" Element");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        
        search(arr);
}
}
