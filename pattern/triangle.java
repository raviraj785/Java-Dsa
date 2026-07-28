package pattern;

public class triangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if (i%2!=0) {
            // System.out.print((char)(j+64));
             System.out.print(j);
        }
        else{
           // System.out.print(j);
           System.out.print((char)(j+64));
            }
        }
        System.out.println();
    }
}
}


