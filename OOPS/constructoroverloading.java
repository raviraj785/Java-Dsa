public class constructoroverloading {
    public static void main(String[] args) {
        A ref = new A();
        A refA = new A(10, 30);
        A refA2 = new A(10, 20.5);
    }
}
class A{

    int a = 10 ; int b =20;double c;
    A (){
        System.out.println(a+b);
    }
    A(int a , int b ){
       c = a+ b;
       System.out.println(c);
    }
    A(int a , double b ){
        c = a+b;
        System.out.println(c);
    }
}
