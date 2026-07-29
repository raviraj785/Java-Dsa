import java.util.Scanner;

public class prefixRangeQuery {

    // Function to create Prefix Sum Array
    static int[] makePrefixSumArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Using 1-based indexing
        int[] arr = new int[n + 1];

        System.out.println("Enter " + n + " elements:");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create Prefix Sum Array
        int[] prefSum = makePrefixSumArray(arr);

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter range (l r): ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefSum[r] - prefSum[l - 1];

            System.out.println("Sum = " + ans);
        }

        sc.close();
    }
}