import java.util.ArrayList;
public class arrayylisttt {
    public static void main(String[] args) {
        
        ArrayList <Integer> l1 = new ArrayList<>();
        //Add New Element

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        // Get An Element At Index i
        System.out.println(l1.get(1));

        // print all Element With Loop
        for(int i = 0; i < l1.size(); i++){
            System.out.print(l1.get(i) + " ");

        }
       
        // Printing The Arraylist Directly Without Using Loop
            System.out.println(l1 + " ");
        // Adding Element At Some Index i 
        l1.add(1, 10);
        System.out.println(l1);

        //Removing Eleemnt At Index i
        l1.remove(1);
        System.out.println(l1);

        // Romoving An Elelment Particular Elelemnt E

        l1.remove(Integer.valueOf(3));
        System.out.println(l1);
        // Checking If Element Exist
        boolean ans = l1.contains(Integer.valueOf(60));
        System.out.println(ans);

        //if You Dont Specify Class , You Can Put Anything Inside l1

        ArrayList l= new ArrayList<>();
        l.add("Raviraj")
    }


}
