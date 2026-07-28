public class findallindex {
    
    

    public static void findallindex(int arr [] , int n , int target , int idx){
              if( idx >= n ){
                return;
              }   
              if(arr[idx] == target ){
              System.out.println(idx);
              } 
              findallindex(arr, n, target, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,10,3,10,5,6,7,8,9,10};
        int target = 10;
        int n = arr.length;
        
       findallindex(arr, n, target, 0);
    }
}




