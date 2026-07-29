import java.util.Scanner;

public class rotatearrayktimesAnother {

    // Swap function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse function (between two indexes)
    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    // Rotate In Place (Right Rotation)
    static void rotateInPlace(int[] arr, int k) {
        int n = arr.length;

        k = k % n;   // handle k > n

        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Print Array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,6,7,8};

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Original Array:");
        printArray(arr);

        rotateInPlace(arr, k);

        System.out.println("Array After Rotation:");
        printArray(arr);
    }
}