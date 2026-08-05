public class FindIndexrotetedSortedArrayWithDuplicates {
   
 
    static boolean findindexinrotetedarray(int arr[] , int target){
        int st = 0;
        int end = arr.length -1;
        while (st <= end) {
            int mid = st + (end - st )/2;
            if (arr[mid] == target) {
                return true;
            }
             if (arr[st] == arr[mid] && arr[mid] == arr[end]) {
                st++;
                end--;
             }
            else if (arr[mid] <= arr[end]) {
             if (target > arr[mid] && target <  arr[end]) {
                st = mid +1;
            }
            else{
                end = mid -1 ;
            
            }
        }
            else{
            
            if (target >= arr[st] && target < arr[mid]) {
                 end = mid- 1;
            }
            else{
                st = mid + 1;
            }
        }

        }

        
        return false ;

    }
    public static void main(String[] args) {
        int arr [] = {1,1,1,2,2,3,1};
        int target = 1;
        System.out.println(findindexinrotetedarray(arr, target));
        
    }
}

    
