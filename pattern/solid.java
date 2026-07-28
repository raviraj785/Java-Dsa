package pattern;
import java.util.*;
public class solid {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number number of row and column");
    int m = sc.nextInt();
    //  int n = sc.nextInt();
    //  for(int i=1;i<=m;i++){
    //     for(int j= 1;j<=n;j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //  }
    for(int j= 1;j<=m;j++){
        for(int i=1;i<=m;i++){
            System.out.print((char)(i+64)+" ");}
        // System.out.print("* ");}
             System.out.println();
         }
    }
    
}
