import java.util.Scanner;

public class SortArray {

    static int[] sortSquares(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = 0;   // fill from start

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }

        return ans;
    }

    // 🔥 Reverse Function
    static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = sortSquares(arr);

        reverse(ans);   // 👈 yaha reverse call ho raha hai

        printArray(ans);

        sc.close();
    }
}