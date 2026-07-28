import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        // for (int i=1 ;i<=n;i++){
        //     if(i%2==0){
        //        System.out.println(i + " = is a even Number");
        //     } 
        //     else {
        //         System.out.println(i +" = is a odd Number ");
        //     }
        for (int i=0 ;i<=n;i+=2){
            System.out.println(i);
        }
    }
    
}
