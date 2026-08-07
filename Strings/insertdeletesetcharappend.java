public class insertdeletesetcharappend {
    public static void main(String[] args) {
    StringBuilder  str = new StringBuilder("Helle");
     System.out.println(str); 
      
      str.setCharAt(0, 'm');
      System.out.println(str);

      str.append(10);
      System.out.println(str);

      str.insert(2, 'y');
       System.out.println(str);
       
       str.delete(0, 02);
       System.out.println(str);
       }
    
}
