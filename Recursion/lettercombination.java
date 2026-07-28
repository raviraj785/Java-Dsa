public class lettercombination {
    static void combination( String dight , String keypad [] ,  String result){
        if(dight.length() == 0 ){
            System.out.println(result + "");
            return ;

        }
        int charnum = dight.charAt(0) - '0' ; // 2

        String currchoice  = keypad[charnum]; //"abc"
        for(int i = 0 ; i < currchoice.length() ; i++){
         combination(dight.substring(1), keypad, result + currchoice.charAt(i));
        }
    }
    public static void main(String[] args) {
         String digit = "253";
         String keypad [] = { " " , "", "abc", "def", "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
         combination(digit, keypad, "");
    }
}
