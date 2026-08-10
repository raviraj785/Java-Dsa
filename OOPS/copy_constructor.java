public class copy_constructor {
    public static void main(String[] args) {
            Student s = new Student();
            s.name ="Raviraj";
            s.roll = 456;
            s.Password = "Raviraj@qwerty";
             s.marks[0] = 100;
             s.marks[1] = 90;
             s.marks[2] = 80;
          Student s1 = new Student(s);
            s1.Password = "xyz";
            s1.marks[2]= 100;
              
           for(int i = 0 ; i < 3 ; i++){
            System.out.println(s1 .marks[i] );
           }    

    }
    
}

class Student{
    String name;
    int roll;
    String Password;
     int marks [];
    Student(){

    }
    // copy contructor 
     Student (Student  s){
        marks = new int[3];
        this.name = s.name;
        this.roll = s.roll;
        this.marks = s.marks;
     }
}