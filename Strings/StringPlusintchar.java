public class StringPlusintchar {
    
    public static void main(String[] args) {
        String str = "abcde";
        for(int i = 0 ; i < str.length() ; i ++){
            for(int j =  i + 1  ; j <= str.length() ; j ++)
            System.out.print(str.substring(i,j) + " ");
        }
    }
}
