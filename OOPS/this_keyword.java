// This Keyword refers To the current object
// public class this_keyword {
//    void show (){
//     System.out.println(this);
//    } 

//    public static void main(String[] args) {
//     this_keyword ref = new this_keyword();
//     System.out.println(ref);
//     ref.show();
//    }
// }

// when instance and local variable same then class
 /* this_keyword
 
public class this_keyword {
      
    public static void main(String[] args) {
        A ref = new A(100);
        ref.show();
    }
    
}
class A {
     int a  ; // instance variable 
     A(int a ){
        // a = a --> here compiler (JVM )get confuse which one executed 
        this.a = a ; // local variable

     }
     void show(){
        System.out.println(a );
     }
}
    
*/
/*
 * this_keyword --> when you want to caalled defult constructor its own class 
 
public class this_keyword {

    public static void main(String[] args) {
        A ref = new A();
        A ref1 = new A();
    }
}
class A {
    int a ;
    int b ;
    A(){
        a = 10 ; b =29;
       System.out.println(a +b);
    }
    A(int a , int b ){
        System.out.println(a + b );
        this();
    }
}
    */
   /**
    * this_keyword --> it also called parametr constructor
    */
   public class this_keyword {
    public static void main(String[] args) {
        A ref  = new A();
    }
    
   }
   class A {
    A (){
        this(10);
    }
    A(int a ){
        System.out.println(a);
    }
   }
