import java.util.Scanner;

public class gcd {
    public static int findgcd(int x , int y){
        while (x % y != 0) {
             int rem = x % y;
             x = y;
             y = rem;
        }
        return y;
    }
    public static int findgcd2(int x , int y){
        if (y == 0 ){
            return x;
        }
        return findgcd2( y , x % y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The vLaue OF X nd Y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(findgcd2(x, y));
        
    }
}
