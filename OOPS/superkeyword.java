public class superkeyword {
  public static void main(String[] args) {
    B ref = new B();
    ref.show();
  }
    
}
class A {
     
    void show(){
         
        System.out.println("Hello");
    }

}
class B extends A {
    
    void show(){
        super.show();
        System.out.println("hi");
    }
}
