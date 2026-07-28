package pattern;

import java.util.Scanner;

public class ultatraingle {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j= 1;j<=n+1-i;j++){
            // System.out.print("*");
            // System.out.print(j);
           //  System.out.print((char)(j+64));
        //    System.out.print((char)(i+64));
        if (i%2!=0) {
            // System.out.print((char)(j+64));
             System.out.print(j);
        }
        else{
           // System.out.print(j);
           System.out.print((char)(j+64));
        }
        }
        System.out.println();
    }
    }
}
