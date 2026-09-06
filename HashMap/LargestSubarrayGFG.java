import java.util.HashMap;

public class LargestSubarrayGFG {
    int zeroSumLargestSubArray(int [] arr, int n ){
        HashMap<Integer , Integer > mp = new HashMap<>();

        int maxlen = 0, presum = 0;
        mp.put(0,  -1);
        for(int i = 0 ; i < arr.length ; i++){
            presum += arr[i];
            if (mp.containsKey(presum)) {
                maxlen = Math.max(maxlen, i - mp.get(presum));
            }
            else {
                mp.put(presum, i);
            }
        }
        return maxlen;
    }
}
