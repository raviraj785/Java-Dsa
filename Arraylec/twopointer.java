import java.util.Scanner;


public class twopointer {
   
    public static void printarray(int []arr ){
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
     static void swap(int []arr ,int i,int j){
        int temp =arr[i];
         arr[i]= arr[j];
         arr[j]= temp;
    }
    static void sortzeroandone(int [] arr){
    int n= arr.length;
    int zeroes = 0;
    // count number of zero
    for(int i= 0;i<n;i++){
        if(arr[i]==0){
            zeroes++;
        }
    }
    // ) to zeros -1 & zoroes to n-1 :
    for(int i= 0; i<n;i++){
        if(i < zeroes){
            arr[i]=0;
        }
        else{ 
            arr[i]= 1;
        }

    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int size= sc.nextInt();
        int arr[]= new int [size];

       System.out.println("ENter "+ size +" Element");
       for(int i =0;i<arr.length;i++){
        arr[i]= sc.nextInt();
       }
      

       System.out.println("Original Array");
       printarray(arr);
      
       sortzeroandone(arr);
       System.out.print("Sorted Array");
       printarray(arr);


    }
}
