package pattern;

import java.util.Scanner;

public class reversetrainagle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
  int num =1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
            //     if((i + j) > n)
            //         System.out.print("* ");
            //     else
            //         System.out.print("  ");
            // 
            System.out.print( "#");    
        }
        // for(int j= 1; j<=n;j++){
             for(int j= 1; j<=i;j++){
           System.out.print(num++);
           //stem.out.print("*");
          // System.out.print((char)(j+64));
          //  System.out.print((char)(i+64));
        }
             
            System.out.println();
        }
    }
}
