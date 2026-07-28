import java.util.*;
public class prime {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    boolean flag =false;
    //for(int i=2;i<n;i++){
         for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            flag = true;
            break;
        }
    }
      
   if(flag==false){
    System.out.println("Prime  Number ");
   }
   else{
     System.out.println("Composities Number ");
   }



}

    
}
