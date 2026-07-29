public class multiarray {
     public static void multiarrayy(){
       int arr[][] =  {{40,20,6} ,{15,89,64},{53,89,75}};
      //    System.out.println("40,20,6");
      //  System.out.println(arr[0][0]);
      //  System.out.println(arr[0][1]);
      //  System.out.println(arr[0][2]);
      //  System.out.println("15,89,64");
      //  System.out.println(arr[1][0]);
      //  System.out.println(arr[1][1]);
      //  System.out.println(arr[1][2]);
      //  System.out.println("53,89,75");
      //  System.out.println(arr[2][0]);
      //  System.out.println(arr[2][1]);
      //  System.out.println(arr[2][2]);

      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
          System.out.println(arr[i][j]);
        }
      }
    }
   public static void main(String[] args) {
   // multiarray obj = new multiarray();
     multiarrayy(); 
   } 
}
