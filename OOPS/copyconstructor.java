class copyconstructor {
    public static void main(String[] args) {
        A ref = new A();
        A ref2 = new A(ref);
    }
}
class A {
    int a ; String b;
    A(){
      a = 10 ; b = "Raviraj";
      System.out.println("Before The Copy "+  a + " " + b);
    }
    A( A ref){
        a = ref.a;
        b = ref.b;
        System.out.println("After The Copy " + a + " " + b );
    }
}
