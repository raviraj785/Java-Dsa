import java.util.*;
public class uppertolowercasewithstring {
    


    public static void main(String[] args) {

          String str = "phYSiCs";
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {

            // check Alphabet -> Small , capital
            boolean flag = true;
            char ch = str.charAt(i);

            if (ch == ' ')
                continue;

            int ascii = (int) ch;

            if (ascii >= 97 && ascii <= 122) {
                if (flag == true) {
                    ascii -= 32;      // <-- yaha +32 ki jagah -32
                    char dh = (char) ascii;
                    str = str.substring(0 , i) + dh + str.substring(i+1);
                }
            } else if (ascii >= 65 && ascii <= 90) {
                ascii += 32;          // <-- yaha -32 ki jagah +32
                char dh = (char) ascii;
                str = str.substring(0 , i) + dh + str.substring(i+1);

            }
        }

        System.out.println(str);
    }
}

