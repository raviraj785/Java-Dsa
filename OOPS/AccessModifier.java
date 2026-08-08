public class AccessModifier {
    public static void main(String[] args) {
     
     Bankaccount myac = new Bankaccount();
     myac.Username = "Raviraj";
     // Here We Cant Acces Private 
     //myac.Password = "Raviraj@kjfea";

         myac.setpassword("Qwert@5u3");
         System.out.println(myac.Username );
         // Only We Can Update privtes Cant Print
        // System.out.println(myac.Password);
}

}
class Bankaccount {
   public  String Username;
    private String Password ;
     
    public void setpassword(String pwd){

        Password = pwd;
    }

}
