import java.util.Stack;

public class InfixToPostFix {
      public static void main(String[] args) {

        String infix = "9-(5+3)*4/6";
        System.out.println(infix);

        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {

            char ch = infix.charAt(i);
            int ascii = (int) ch;

            // '0' -> 48 && '9' -> 57
            if (ascii >= 48 && ascii <= 57) {
                String s = "" + ch;
                val.push(s);
            }

            else if (ch == '(') {
                op.push(ch);
            }

            else if (ch == ')') {
                while (op.peek() != '(') {

                    // Work 
                    String v2 = val.pop();
                    String v1 = val.pop();

                    char o = op.pop();
                    String t = v1 + v2 + o;
                    val.push(t);
                }
                op.pop();
            }

            else {

                if (ch == '+' || ch == '-') {

                    // Kam niptana hain
                    while (op.size() > 0 && op.peek() != '(') {

                        String v2 = val.pop();
                        String v1 = val.pop();
                        
                        char o = op.pop();
                        String t = v1 + v2 + o;
                        val.push(t);
                    }

                    // After work push
                    op.push(ch);
                }

                if (ch == '*' || ch == '/') {

                    while (op.size() > 0 &&
                          (op.peek() == '*' || op.peek() == '/')) {

                        String v2 = val.pop();
                        String v1 = val.pop();
                        
                        char o = op.pop();
                        String t = v1 + v2 + o;
                        val.push(t);
                    }

                    // push
                    op.push(ch);
                }
            }
        }

        while (op.size() > 0) {

            String v2 = val.pop();
            String v1 = val.pop();
                        
            char o = op.pop();
            String t = v1 + v2 + o;
            val.push(t);
        }

        String postfix = val.pop();
        System.out.println(postfix);
    }
}