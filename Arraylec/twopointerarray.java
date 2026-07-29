import java.util.*;

public class TwoPointerArray {

    static int[] sortSquares(int[] arr) {
        int n = arr.length;

        // Step 1: Sort the array first
        Arrays.sort(arr);

        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = n - 1;   // fill from last index

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k] = arr[left] * arr[left];
                left++;
            } else {
                ans[k] = arr[right] * arr[right];
                right--;
            }
            k--;
        }

        return ans;
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = sortSquares(arr);

        System.out.println("Sorted Squares:");
        printArray(result);

        sc.close();
    }
}