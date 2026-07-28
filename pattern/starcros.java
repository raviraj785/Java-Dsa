package pattern;
import java.util.*;
public class starcros {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Row  Number");
    int m = sc.nextInt();
    //  System.out.println("Enter the columns Number");
    // int n = sc.nextInt();
    for(int i= 1;i<=m;i++){
       for(int j= 1;j<=m;j++)   { 
        if((i+j)==(m+1) || (i-j)==0)  System.out.print("*");
          else System.out.print(" ");

}
System.out.println();
    }
}
}