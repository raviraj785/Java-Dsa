package pattern;

import java.util.Scanner;

public class rohmbus {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
     //int nsp = n-1;
     int nsp = 0;
   int nst =n;
   for(int i=1;i<=n;i++){
         for(int j=1;j<=nsp;j++){
            System.out.print(" ");
         }
         for(int j=1;j<=nst;j++){
            System.out.print("*");
    }
    nsp--;
    nst--;
    //nst+=1;
   // nst+=2;
    System.out.println();
    
}
    }
    
    
}
