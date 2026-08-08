class firstclassandobject{
    // Making a class 
     static class student {
        String name ;
        int age ;
        double  percentage;
     }
    public static void main(String[] args) {
        // creating object 
        // classname  objname = new calssname()
          
         student s1 = new student();
         s1.name = "Raviraj Kumar singh ";
         s1.age = 21;
         s1.percentage = 72.50;

        System.out.println(s1.name);

        student s2 = new student();
         s2.name = "Vivek Kumar Singh";
         s2.age  = 19;
         s2.percentage = 65;
         System.out.println(s2.name);
        }
}