import java.util.Scanner;
public class makeprefixsumwith1inding {
    


    public static void printarray(int arr[]){
    for(int i = 1 ; i < arr.length ; i++){
       System.out.print(arr[i]+" ");
    }
    System.out.println();
 }


 public static int[] prefixsumm(int arr[]){
    for(int i =1 ; i< arr.length ;i++){
        arr[i]= arr[i] + arr[i-1];
    }
    return arr;
  }
        

 public static void main(String[] args) {
    
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Size Of array");
        int n = sc.nextInt();
        int arr[] = new int [n+1];
        System.out.println("Enter"+ n+" Element");
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("ORiginal Array : ");
          printarray(arr);
           int presum [] = prefixsumm(arr);
          System.out.print(" Prefix Sum : ");
          printarray(presum);
          
          System.out.println("Enter The Number of query :");
          int q = sc.nextInt();
          while (q-- > 0) {
              


            System.out.println("Enter Range ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            if (l < 1 || r > n || l > r) {
            System.out.println("Invalid Range");
           } 
           else {
           int ans = presum[r] - presum[l - 1];
           System.out.println("Sum = " + ans);
}
      
           


          }

    }
}



