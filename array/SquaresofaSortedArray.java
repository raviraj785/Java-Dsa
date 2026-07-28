import java.util.Scanner;

public class SquaresofaSortedArray {

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] reverseearray(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;

        for (int i = n - 1; i >= 0; i--) {
            ans[j] = arr[i];
            j++;
        }

        return ans;
    }

    public static void sortSquared(int[] arr) {

        int n = arr.length;
        int left = 0, right = n - 1, k = 0;

        int[] ans = new int[n];

        while (left <= right) {

            // Bigger absolute value ka square ans me store karo
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {

                ans[k++] = arr[left] * arr[left];
                left++;

            } else {

                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }

        int[] answer = reverseearray(ans);
        printarray(answer);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Size Of Array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " Elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sorted Squares:");
        sortSquared(arr);

        sc.close();
    }
}