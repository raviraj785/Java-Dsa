public class constructor_overloading {
    public static void main(String[] args) {
        A r = new A();
        A r1 = new A(1, 2);
        A r2 = new A(50, "Raviraj");
        System.out.println(r.a + r.b + r.c);
        System.out.println(r1.a + r1.b);
        System.out.println(r2.a +" "+  " " + r2.c);
    }
}
class A{
    int a ; int b ; String c ;
    A(){
       a = 100;
       b = 100;
       c = "Raviraj";
    }
    A (int x , int y){
     
     a = x;
     b = y;
}
    
    A(int x , String z ){
        a =x ;
        c = z;
    }
}