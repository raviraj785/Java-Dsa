public class equalstrings {
    public static void main(String[] args) {
        String str = "abc";
         String gtr = "abc";
        String  str3  = new String("abc") ;
        System.out.println((str == gtr)); // true
        System.out.println(str == str3); // false
        System.out.println(str.equals(str3)); // true
        
    }
}
