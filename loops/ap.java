//1,3,5,7,9.............. Nth term
    import java.util.*;
 public class ap {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    // for(int i=1;i<=(2*n-1);i+=2) {
    //     System.out.println(i);

    // }
    // for(int i=4;i<=(3*n+1);i+=3) {
    //     System.out.println(i);

    // }
    int a=4,d=3;
for(int i=1;i<=n;i++) {
        System.out.println(a);
       a+=d;

    }

}
    
}


