
class A {
    int  x , y ;
    String z;
    A(){
    x = 10;
    y = 20 ;
    System.out.println(x+y);  
    }
    A (int a , int b ){
         x = a ;
         y = b ;
    }
    void show (){
        System.out.println(x + y );
    }
    A(int a , String b){
      System.out.println(a + " " + b);
      
    }
}
public class parameterconstructor {
   public static void main(String[] args) {
     A ref = new A();
    A ref2 = new A(5, 025);
    ref2.show();
    A ref3 = new A(4, "Raviraj");
   }
}
