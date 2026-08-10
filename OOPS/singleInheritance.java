public class singleInheritance {
    public static void main(String[] args) {
        Raviraj rr= new Raviraj();
        rr.input();
        rr.disp();
    }
}
class Student {
    String name;
    int roll ; 
    int marks ;
    void input(){
        System.out.println("Enter Your Name Roll Marks");
    }

}
class Raviraj extends Student{
    void disp (){
      roll = 1;
      name = "Raviraj";
      marks = 90;
      System.out.println(name +"  Roll IS " +  roll + " Marks Is "+ marks);
    }
}