public class privateconstructor {
  
    // int a , b , c ;
    // private privateconstructor (){
    //     a = 10 ;b = 20 ; c = 30;
    //     System.out.println(a + b + c);
    // }
    public static void main(String[] args) {
       // privateconstructor ref = new privateconstructor();
       A ref =  new A();
    }
    
} 
// But Here The Some Restration On private constructor

class A {
    int a , b , c;
    private A (){ // if we do Public then we can acess The value of construtor
        a = 10 ; b = 20; c = 30 ;
        System.out.println(a + b + c);
        }
}
