// public class copiearray { 
//     public static void printarray(int arr[]){
//       for(int i= 0;i<arr.length;i++){
//         System.out.print(arr[i]+ " ");

//       } 
//       System.out.println();
//     }
    
//     public static void main(String[] args) {
//         int [] arr = new int[5];
//       arr[0]=1; 
//       arr[1]=2; 
//       arr[2]=3; 
//       arr[3]=4; 
//       arr[4]=5; 
//         System.out.println("Original array");
//         printarray(arr);

//         //int [] arr_2 =arr;
//         int [] arr_2 =arr.clone();// new memory create in heap and arr value copy in arr_2 arr value not affected 
//         System.out.println("Copiee value ");
//         printarray(arr_2);
      
//         arr[0]=9;
//         arr[1]=8;
//         System.out.println(" Changing value in Original Array");
//         printarray(arr);
//          System.out.println(" Changing value in Copie  Array");
//         printarray(arr_2);
//     }
    
// }
import java.util.Arrays;

public class copiearray { 

    public static void printarray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0]=1; 
        arr[1]=2; 
        arr[2]=3; 
        arr[3]=4; 
        arr[4]=5; 
        
        System.out.println("Original array");
        printarray(arr);

        // Copy from index 1 to 4 (4 not included)
        int [] arr_2 = Arrays.copyOfRange(arr, 1, 4);
        
        System.out.println("Copied value");
        printarray(arr_2);
      
        arr[0]=9;
        arr[1]=8;
        
        System.out.println("Changing value in Original Array");
        printarray(arr);
        
        System.out.println("Changing value in Copied Array");
        printarray(arr_2);
    }
}
