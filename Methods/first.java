package function;

public class first {
    public static void name(){
        System.err.println("Hello Good Morning  (Second execution line )");
        for(int i=1;i<=10;i++){

            
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println(" First execute line");
        name();
        System.out.println( "last execution line");
    }
    
}
