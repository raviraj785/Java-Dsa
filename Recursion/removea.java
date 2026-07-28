import java.util.Scanner;

public class removea {
    public static String removeafromstring2(String s){
        if(s.length() == 0) return " ";
        
        String smallans = removeafromstring2(s.substring(1));
        char curre = s.charAt(0);
        if(curre != 'a'){
            return curre + smallans;
        }
        else{
            return smallans;
        }
    }
     public static String removeafromstring(String s , int idx){
        //base case
        if(idx == s.length()){
            return "";
        }
        //recursive call 
        
        String smallans = removeafromstring(s, idx+1);

        char currelement = s.charAt(idx); 
 
        if(currelement != 'a'){
            return currelement + smallans;
        }
        else{
            return smallans;
        }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
          System.out.println(removeafromstring(s, 0));
          System.out.println(removeafromstring2(s));
        
    }
}

