public class multilevelinheritance {
    public static void main(String[] args) {
        C ref = new C();
        ref.sum();
        ref.sub();
        ref.multi();
    }
}
class A {
    int a ; int b ;
    void sum(){
        a = 100;
        b = 200;
        System.out.println("Sum Is  : " + (a + b));
    }

}
class B extends A{
    void sub(){
        a = 200;
        b =100;
        System.out.println("Sub Is : " + (a-b));
    }
}
 class C extends B{
    void multi(){
        a = 10 ;
        b = 10;
        System.out.println("Multiplication is : "+a*b);
    }
 }

