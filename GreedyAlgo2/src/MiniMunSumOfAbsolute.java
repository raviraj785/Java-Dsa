import java.util.Arrays;

public class MiniMunSumOfAbsolute {
   public static void main(String[] args) {
        int A [] = {1,2,3};
        int b [] = {2,1,3};

        Arrays.sort(A);
        Arrays.sort(b);

        int minDiff = 0;

        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - b[i]);
        }
        System.out.println(minDiff);
    }
}
