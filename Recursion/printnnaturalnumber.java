import java.util.Scanner;

/**
 * printnnaturalnumber
 */
public class printnnaturalnumber {

    public static void printincreasing(int n ){

        if(n==1){
            System.out.println(n);
            return ; 
        }
        printincreasing(n-1);
       System.out.println(n);
    }
 
    static void printdeccreasing(int n ){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printdeccreasing(n-1);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter The Value Of n ");
         int n = sc.nextInt();
        // printincreasing(n);
        printdeccreasing(n);
    }
}