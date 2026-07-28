import java.util.*;
public class continu {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    // for(int i= 1;i<=n;i++){
    //     System.out.println("Hello");
    //     if(i%2==1){
    //continue;
    //         System.out.println(i);
    // odd number 1 to 100.
     for(int i= 1;i<=n;i++){
       
        if(i%2==0)
           continue;
            System.out.println(i);
        
    }
    }
}

