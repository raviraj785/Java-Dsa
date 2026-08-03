public class lastoccurence {
    static int  lo(int arr[] , int target){
        int lo = -1;
        int st = 0 ;
        int end = arr.length -1;
    while (st<=end) {
        int mid = st + (end - st) / 2 ;
        if (arr[mid] == target) {
            lo = mid ;
            st = mid +1;
        }
        else if (target > arr[mid]){
           st = mid +1 ; 
        }
         else {
            end = mid-1 ;
         }
        
    }
    return lo;
    
    }
    public static void main(String[] args) {
        int  arr [] = {2,3,4,5,5,6,7,7,7,7,7};
        int target = 7;
        int ans = lo(arr, target);
        System.out.println(ans);
    }
}

