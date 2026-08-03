public class firstoccurenceinBinaryserch {
    static int  fo(int arr[] , int target){
        int fo = -1;
        int st = 0 ;
        int end = arr.length -1;
    while (st<=end) {
        int mid = st + (end - st) / 2 ;
        if (arr[mid] == target) {
            fo = mid ;
            end = mid-1;
        }
        else if (target < arr[mid]){
            end = mid - 1 ; 
        }
         else {
            st = mid +1 ;
         }
        
    }
    return fo;
    
    }
    public static void main(String[] args) {
        int  arr [] = {2,3,4,5,5,6,7,8};
        int target = 5;
        int ans = fo(arr, target);
        System.out.println(ans);
    }
}
