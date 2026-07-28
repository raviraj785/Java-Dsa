package pattern;

public class rev {
    public static void main(String[] args) {
     int n = 4;
 int num =1;
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= n - i + 1; j++) {
       // System.out.print((char)(i+64));
       System.out.print(num++ + " ");
    }
    System.out.println();
}

    }
    
}
