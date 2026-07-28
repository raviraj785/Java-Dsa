import java.util.ArrayList;

public class returnsubsequence {

    public static ArrayList<String> getssq(String s){
        ArrayList<String> ans = new ArrayList<>();
        // Base Case 
        if (s.length() == 0) {
            ans.add(" ");
            return ans;
        }

        // Recursive Call Or Small Answer
         char curr = s.charAt(0); //a 
        ArrayList<String> smallans = getssq(s.substring(1)); // { ["bc"] , [b] , [c] , " " }

        // Smallans = { ["bc"] , [b] , [c] , " " }
        for(String ss : smallans){
            ans.add(ss); //  Smallans = { ["bc"] , [b] , [c] , " " }
            ans.add(curr + ss ); //  Smallans = { [abc] [ab] [ac] [a] ["bc"] , [b] , [c] , " " }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList < String > ans = getssq("abc");
        for(String ss : ans){
            System.out.println(ss);
        }
    }
}
