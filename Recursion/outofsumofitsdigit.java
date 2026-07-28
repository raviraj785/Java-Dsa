import java.util.Scanner;

public class outofsumofitsdigit {

    static  int f(int n){
          if(n >= 0 && n <= 9){
            return n;
          }

          return f(n/10) + n % 10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
    }
}
