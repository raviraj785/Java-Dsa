public class solution {
    static void movezero(int arr[]){

         int j = 0;

         for(int i = 0; i< arr.length ; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
         }
    }
}
class Solution {
    public static void printarray(int nums []){
        for(int i = 0; i<nums.length ; i++){
           System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void swap(int nums[] , int i, int j ){
          int temp = nums[i];
          nums[i] =nums[j];
          nums [j] = temp;
    }
    public static void moveZeroes(int[] nums) {
      int j = 0;
      
      for(int i = 0; i < nums.length ; i++){
        if(nums[i] != 0){
            swap(nums, i, j);
            j++;
        }
      }
    }
    public static void main(String[] args) {
        int nums []= {1,2,3,4,5};
        System.out.println("Original Array ");
        printarray(nums);
        moveZeroes(nums);
        System.out.println("After Moved Array ");
        printarray(nums);
    }
}
