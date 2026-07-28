import java.util.*;
public class factor {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    // for(int i=1;i<=n;i++){
    //     if(n%i==0){
    //         System.out.println(i);
    //     }
    for(int i=n-1;i>=1;i--){
        if(n%i==0){
            System.out.println(i);
            break;
        }
    }
    }
    
}
