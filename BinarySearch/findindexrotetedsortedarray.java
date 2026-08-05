class findindexrotetedsortedarray{
    static int findindexinrotetedarray(int arr[] , int target){
        int st = 0;
        int end = arr.length -1;
        while (st <= end) {
            int mid = st + (end - st )/2;
            if (arr[mid] == target) {
                return mid;
            }
             
            else if (arr[mid] < arr[end]) {
             if (target > arr[mid] && target <  arr[end]) {
                st = mid +1;
            }
            else{
                end = mid -1 ;
            
            }
        }
            else{
            
            if (target >= arr[st] && target < arr[end]) {
                 end = mid- 1;
            }
            else{
                st = mid + 1;
            }
        }

        }

        
        return -1 ;

    }
    public static void main(String[] args) {
        int arr [] = {3,4 ,5 ,1,2};
        int target = 1;
        System.out.println(findindexinrotetedarray(arr, target));
        
    }
}