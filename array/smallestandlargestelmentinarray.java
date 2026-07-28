import java.util.Arrays;

public class smallestandlargestelmentinarray {

    public static int[] smallestndlarge(int[] arr) {

        Arrays.sort(arr);

        int[] ans = {arr[0], arr[arr.length - 1]};

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 7};

        int[] ans = smallestndlarge(arr);

        System.out.println("Smallest = " + ans[0]);
        System.out.println("Largest = " + ans[1]);
    }
}