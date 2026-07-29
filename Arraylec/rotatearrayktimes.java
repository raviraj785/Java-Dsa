import java.util.Scanner;

public class rotatearrayktimes {

    public static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n];

        k = k % n;  // Important if k > n

        int j = 0;

        // Last k elements
        for (int i = n - k; i < n; i++) {
            ans[j] = arr[i];
            j++;
        }

        // Remaining elements
        for (int i = 0; i < n - k; i++) {
            ans[j] = arr[i];
            j++;
        }

        return ans;
    }

    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Size of Array:");
        // int n = sc.nextInt();

        // int[] arr = new int[n];

        // System.out.println("Enter " + n + " Elements:");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        int []arr={1,2,3,4,5,6};

        System.out.println("Enter K:");
        int k = sc.nextInt();

        int[] rotated = rotate(arr, k);

        System.out.println("Rotated Array:");
        printarray(rotated);
    }
}