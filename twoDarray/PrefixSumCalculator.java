import java.util.Scanner;

public class PrefixSumCalculator {
    
    // Method 1: Simple approach - calculates sum without prefix optimization
    public static int findsum(int[][] arr, int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    // Method 2: Builds 1D prefix sum for each row
    public static void findprefixsum(int arr[][]) {
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1]; // FIXED: Added missing semicolon
            }
        }
    }

    // Method 3: Uses prefix sum to find sum in range (with 1D prefix sum per row)
    public static int findsum2(int arr[][], int l1, int r1, int l2, int r2) {
        int sum = 0;
        findprefixsum(arr);
        
        for (int i = l1; i <= l2; i++) { // FIXED: Changed < to <=
            // Calculate sum from r1 to r2 for row i
            if (r1 == 0) {
                sum += arr[i][r2];
            } else {
                sum += arr[i][r2] - arr[i][r1 - 1]; // FIXED: Corrected condition
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Row And Column");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter " + r * c + " Elements");
        
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter l1 And r1 And l2 And r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        
        // Create a copy for findsum (it doesn't modify array)
        int arr1[][] = arr.clone();
        System.out.println("Sum Is: " + findsum(arr1, l1, r1, l2, r2));
        
        // Create another copy for findsum2 (it modifies array for prefix sum)
        int arr2[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j] = arr[i][j];
            }
        }
        System.out.println("Prefix Sum Result: " + findsum2(arr2, l1, r1, l2, r2));
        
        sc.close();
    }
}