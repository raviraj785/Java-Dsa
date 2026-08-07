public class pelindrom {
      public static void main(String[] args) {
        String str = "abcdcba";
    //      StringBuilder gtr = new StringBuilder(str);
    //         gtr.reverse();
    //         String s = str + " ";
    //         if (str.equals(s)) {
    //             System.out.println("pelindrom");
    //         }
    //         else{
    //             System.out.println("Not A pelindrom ");
    //         }
    //   }
     
    int i = 0 ;
    int j = str.length() -1;
    boolean flag = true;
    while (i < j) {
        if (str.charAt(i ) != str.charAt(j)) {
            flag = false;
            break;
        }
        else{
            i ++ ;
            j--;
        }
    }
        if (flag== true) {
             System.out.println("Is pelindrom");
        }
        else{
            System.out.println("Not Pelindrom");
        }
    }
}
