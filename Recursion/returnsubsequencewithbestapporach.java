public class returnsubsequencewithbestapporach {
      public static void printssq(String s ,String currans ){
          if(s.length() == 0) {
            System.out.println(currans);
            return ; 
          }
          char currchar = s.charAt(0);// a 
           String remingString = s.substring(1);

            // curre char --> chose to be part
            printssq(remingString, currans + currchar);
            // curr char --> chose to be not a part 
            printssq(remingString, currans);
      }
    public static void main(String[] args) {
     printssq("121", "");
    }
}
 