public class static_instatance {
    public static void main(String[] args) {
         A ref = new A(); 
    }
}
class A {
    A (){
        System.out.println("Constractor Is calling ");
    }

    {
        System.out.println("Intance IS calling ");
        
    }
    static{
        System.out.println("Static is calling ");
    }
}
