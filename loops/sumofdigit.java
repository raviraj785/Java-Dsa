
import java.util.*;
public class sumofdigit {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();
    int lastdigit ;
    int sum=1;//for multiply 
    //  int sum=0; //for addition
    while (n!=0) {
        
        lastdigit=n%10;
        if (lastdigit!=0) {
             sum*=lastdigit;
        }
       
        //sum+=lastdigit;
        // sum*=lastdigit;
       n= n/10;
    }
    
     
     System.out.println(sum);
     



    }
    
}
