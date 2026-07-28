public class shalocopy {
     public static void printarray(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void changearray(int arr[]){
        for(int i =0; i<arr.length; i++){
           arr[i] = 0;
        }
       
    }

    public static void main(String[] args) {
        
         int arr [] = new int [5];
         arr[0] = 1;
         arr[1] =2 ;
         arr[2]= 3;
         arr[3]= 4;
         arr[4]= 5;
        System.out.println("Original Aarray");
        printarray(arr);
        System.out.println("Now This fuking Array Was changed"); 
        changearray(arr);
        printarray(arr);
       

    }
}

