import java.util.Scanner;

public class factorialwithrecursion {

    public static int   findfact(int n){
      if (n==0) return 1;

      return n * findfact(n-1);
    //   int smallproblem = findfact(n-1);

    //   int ans =n *  smallproblem;
    //    return ans;
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of N ");
        int n = sc.nextInt();
        int ans = findfact(n);
        System.out.println(ans);
    
    }
}
