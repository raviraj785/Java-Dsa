class firstbinser{
    static boolean binarySearch(int arr[] , int target){
        int n = arr.length;
       int st  = 0 ;
       int end = n-1;
       
       while (st <= end)  {
           int mid = (st + end ) / 2 ;
  
           if ( target == arr[mid] ){
            return true;
           }
           else if (target < arr[mid]){
                end = mid - 1;
           }
           else {
            st = mid +1 ;
           }
       }
       return false;

    }
    static boolean recbinsear(int arr[] , int st , int end , int val){
        
        if (st > end) {
            return false;
        }
        int mid = st + (end -st) /2;
         if (arr[mid]== val) {
            return true;
        }
       else if (val < arr[mid]) {
           return recbinsear(arr, st  ,  mid-1,val);
        }
        else
        {
          return  recbinsear(arr, mid+1 , end, val);
        }
       }
    
    public static void main(String[] args) {
        int arr []= {1,2,3,4,5,6,7,8};
        int target = 0;
        while (target != 10) {
             System.out.printf("%d exist in arr :  %b \n" , target , binarySearch(arr, target) );
             System.out.printf("%d exist in arr :  %b \n", target, recbinsear(arr, 0, arr.length-1, target));
             System.out.println();
             target++;
        }
    }
}