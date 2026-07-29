import java.util.Scanner;

public class PresentQuery {

    // Function to create frequency array
    static int[] makeFrequencyArray(int[] arr) {

        int[] freq = new int[100005];   // assuming max value ≤ 100000

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;   // increase count of that number
        }

        return freq;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create frequency array
        int[] freq = makeFrequencyArray(arr);

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        while (q > 0) {

            System.out.print("Enter number to be searched: ");
            int x = sc.nextInt();

            if (freq[x] > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            q--;
        }
    }
}
