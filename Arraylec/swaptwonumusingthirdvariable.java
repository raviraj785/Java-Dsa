public class swaptwonumusingthirdvariable {
     public static void swap(int a,int b){
        System.out.println("Befour change value");
        System.out.println(a+" "+b);
        System.out.println("After swap");
        //  int temp =a;
        //  a =b ;
        // b =temp;
       // without Using This
       a= a+b;
       b=a-b;
       a=a-b; 
        
        System.out.print(a+" "+b);
     }
    public static void main(String[] args) {
        int a=6;
        int b=7;
        swap(a, b);
    }
    
}
