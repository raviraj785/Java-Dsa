public class reverse {
    
    public static void main(String[] args) {
        int n=879456;
       int  lastdigit;
     
  //int sum=0;
        while (n!=0) {
            lastdigit =n%10;
            
            n=n/10;
            System.out.print("Last digit is"+lastdigit);
        }
        System.out.println(lastdigit+n);
      //  System.out.println(lastdigit);
    }
    
}


