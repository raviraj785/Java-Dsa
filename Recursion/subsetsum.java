public class subsetsum {
    public static void subset (int arr[] , int n , int idx , int sum){
        if(idx >= n){
            System.out.println(sum);
            return;
        }
        subset(arr, n, idx+1 ,sum + arr[idx]);
        subset(arr, n, idx + 1, sum);
    }
    public static void main(String[] args) {
        int arr [] = { 2,4,5};
        subset(arr, arr.length, 0, 0);
    }
}
