public class ccopievalueofarray {
    public static void printarray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
         int arr [] = new int [5];
         arr[0] = 1;
         arr[1] =2 ;
         arr[2]= 3;
         arr[3]= 4;
         arr[4]= 5;
         System.out.println("Original Array");
         printarray(arr);
         System.out.println("Copie The Value From Originnal Array ");
         int arr_2 [] = arr;
         printarray(arr_2);
         System.out.println(" after Chance the value ");
         arr_2[2] = 6;
         arr_2[3] = 7;
         printarray(arr_2);

    }
}
