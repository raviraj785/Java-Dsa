public class findfirstindex {
    

    public static int findfirstindex(int arr [] , int n , int target , int idx){
              if( idx >= n ){
                return -1;
              }   
              if(arr[idx] == target ){
                return idx;
              } 
             return findfirstindex(arr, n, target, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int target = 10;
        int n = arr.length;
        
       System.out.println(findfirstindex(arr, n, target, 0));
    }
}


