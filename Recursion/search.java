public class search {

    public static boolean search(int arr [] , int n , int target , int idx){
              if( idx >= n ){
                return false;
              }   
              if(arr[idx] == target ){
                return true;
              } 
             return search(arr, n, target, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        int n = arr.length;
        
       System.out.println(search(arr, n, target, 0));
    }
}
