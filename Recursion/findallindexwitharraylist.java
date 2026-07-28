import java.util.ArrayList;

public class findallindexwitharraylist {
   
     public static ArrayList<Integer> allindice (int arr[] , int n , int x , int idx)
    {
        if(idx >= n){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr[idx] == x ){
            ans.add(idx);
        }
        ArrayList<Integer> smallans = allindice(arr, n, x, idx+1);
        ans.addAll(smallans);
        return ans;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,2,2,1};
        int target =  2 ;
        int n = arr.length;

        ArrayList<Integer> ans = allindice(arr, n, target,0);
           
        for(Integer i : ans){
            System.out.println(i);
        }
}
}
