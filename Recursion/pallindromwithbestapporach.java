import java.util.Scanner;

public class pallindromwithbestapporach {
    public static boolean ispeliindrom(String s , int l , int r){
        if(l >= r) return true;
        return (s.charAt(l) == s.charAt(r) && ispeliindrom(s, l+1, r-1));
        
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         System.out.println(ispeliindrom(s, 0, s.length()-1));
    }
}
