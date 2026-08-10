public class hierarchalinheritence {
    public static void main(String[] args) {
        B refB = new B();
        C refC = new C();
        refB.input(); refB.show();
        refC.input(); refC.disp();
    }
}
class A {
    void input(){
        System.out.println("Enter Your Name");
    }
}
class B extends A{
    void show (){
        System.out.println("My name is Raviraj ");
    }

}
class C extends A{
    void disp(){
        System.out.println("My name is Vivek");
    }
}
