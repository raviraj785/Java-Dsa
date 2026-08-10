public class constructor {
    public static void main(String[] args) {
            Student s = new Student("Raviraj");
            Student s1 = new Student();
            Student s2 = new Student(87);
            System.out.println(s.name + " " + s1.name + " " + " " + s2.roll);

    }
    
}

class Student{
    String name;
    int roll;
   // Parameter constructor
    Student(String name ){
        this.name= name;
       System.out.println("Constructor Is called");
    }
   // defualt constructor
    Student (){
        System.out.println("Constructor IS called.....");
    }
     Student (int roll ){
        this.roll = roll;
     }
}