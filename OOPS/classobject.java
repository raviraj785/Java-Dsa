public class classobject {
    public static void main(String[] args) {
        // 
        Pen p1 = new Pen();
        p1.setcolour("Blue");
        System.out.println(p1.colour);
        p1.setsize(5);
        System.out.println(p1.size);

        //
        Student s1 = new Student();
        s1.name = "Raviraj Kumar Singh";
        s1.Age = 21;
        s1.calculatepercentage(67, 85, 54);
        System.out.println(s1.name +" " +  s1.Age +" "+ s1.percentage);
    }
}
// Class 
class Pen{
    String colour;
    int size ;

    //Function 
    void setcolour(String newcol){
        colour= newcol;
    }
    void setsize(int newsize){
        size = newsize;
    }
}

class Student{
    String name ;
    int Age ;
    int percentage ;

    void calculatepercentage(int phy , int math , int chem){
       percentage =  (phy + math + chem) / 3;
    }
}