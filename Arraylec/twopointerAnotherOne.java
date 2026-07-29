
import java.util.Scanner;


public class twopointerAnotherOne {
   
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
    
    public static void sortzeroandone(int [] arr){
        int n = arr.length;
        int left =0;
        int  right =n-1;
        while(left<right){
        if(arr [left]==1 && arr[right]==0){
            swap(arr, left, right);
            left++;
            right--;
        }
        if(arr[left] ==0){
            left ++;
        }
        if(arr[right] ==1){
            right --;
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
       System.out.print("Sorted Array Is = ");
       printarray(arr);


    }
}

