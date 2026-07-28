public class printallthevalueofarray {
    public static void  printarray(int arr[] , int idx){
     if(idx == arr.length) return;
     System.out.println(arr[idx]);
       printarray(arr, idx+1);
    }
   public static void main(String[] args) {
     int arr[] = {1,2,3,4,5,6,7,8,9};
     printarray(arr, 0);
   }
}
