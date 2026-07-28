import java.util.Scanner;
public class onetoN {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n;
        n = sc.nextInt();
        for(int i= 1;i<=n;i++){
            System.out.print(i+ " ");
        }
    }
}
