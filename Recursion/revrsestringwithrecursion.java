import java.util.Scanner;

public class revrsestringwithrecursion {
    public static String reveString2(String s ){
        
        if(s.length()== 0){
            return "";
        }
        String smallans = reveString2(s.substring(1));
        char curr = s.charAt(0);
        return smallans + curr;
    }
    public static String reveString(String s , int idx ){
        
        if(s.length()== idx){
            return "";
        }
        String smallans = reveString(s, idx+1);
        
        return smallans + s.charAt(idx);
    }
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enetr The fucking String  what You Want to do reverse");
        String s = sc.nextLine();
       System.out.println(reveString(s, 0));
       System.out.println(reveString2(s));
    }
}
