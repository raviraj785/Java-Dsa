package pattern;

import java.util.Scanner;

public class starpyramid {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    // for(int i=1;i<=n;i++){
    //      for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //      }
    //      for(int j=1;j<=2*i-1;j++){
       // System.out.print("*");
              // System.out.print((char)(j+64));
// System.out.print((char)(i+64));
//}
   int nsp = n-1;
   int nst =1;
   for(int i=1;i<=n;i++){
         for(int j=1;j<=nsp;j++){
            System.out.print(" ");
         }
         for(int j=1;j<=nst;j++){
            System.out.print("*");
    }
    nsp--;
    //nst+=1;
    nst+=2;
    System.out.println();
    
}
    }
}
