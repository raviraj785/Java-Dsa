import java.util.Scanner;

public class pallindromwithrecursion {
    public static String reveString(String s , int idx ){
        
        if(s.length()== idx){
            return " ";
        }
        String smallans = reveString(s, idx+1);
        
        return smallans + s.charAt(idx);
    }
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enetr The fucking String  what You Want to do reverse");
        String s = sc.nextLine();
     String rev = reveString(s, 0);
     if(rev.equals(s)){
        System.out.printf(  " %s Is plindrom" , s );
         

     }
     else{
        System.out.printf( " %s IS not A palindrom Number " , s );
     }
    }
}

    

