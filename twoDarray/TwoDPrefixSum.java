import java.util.Scanner;

public class TwoDPrefixSum {
    
    // Method 1: Build 2D Prefix Sum Matrix
    // Traverse horizontally (row-wise) then vertically (column-wise)
    public static void findPrefixSumMatrix(int[][] matrix, int r, int c) {
        // Traverse horizontally to calculate row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        
        // Traverse vertically to calculate column-wise prefix sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    }
    
    // Method 2: Find sum over columns and rows both using 2D prefix sum
    // Uses inclusion-exclusion principle
    // Parameters: l1, r1 (top-left corner), l2, r2 (bottom-right corner)
    public static int findSum3(int[][] matrix, int l1, int r1, int l2, int r2) {
        int left = 0, up = 0, leftUp = 0;
        
        // Get value from left
        if (r1 >= 1) {
            left = matrix[l2][r1 - 1];
        }
        
        // Get value from up
        if (l1 >= 1) {
            up = matrix[l1 - 1][r2];
        }
        
        // Get value from top-left corner
        if (l1 >= 1 && r1 >= 1) {
            leftUp = matrix[l1 - 1][r1 - 1];
        }
        
        // Apply inclusion-exclusion principle
        int sum = matrix[l2][r2] - left - up + leftUp;
        return sum;
    }
    
    // Method 3: Simple brute force approach (for comparison)
    public static int findsum(int[][] arr, int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    
    // Helper method: Print matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Number Of Row And Column");
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println("Enter " + (r * c) + " Elements");
        int[][] arr = new int[r][c];
        int[][] arrCopy = new int[r][c];
        
        // Input array
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
                arrCopy[i][j] = arr[i][j]; // Keep original for brute force comparison
            }
        }
        
        System.out.println("\nOriginal Matrix:");
        printMatrix(arr);
        
        System.out.println("Enter l1 And r1 And l2 And r2 (0-indexed)");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        
        // Brute Force Approach
        System.out.println("\n--- BRUTE FORCE APPROACH ---");
        System.out.println("Sum (Brute Force): " + findsum(arrCopy, l1, r1, l2, r2));
        
        // 2D Prefix Sum Approach
        System.out.println("\n--- 2D PREFIX SUM APPROACH ---");
        findPrefixSumMatrix(arr, r, c);
        
        System.out.println("Prefix Sum Matrix:");
        printMatrix(arr);
        
        System.out.println("Sum (2D Prefix Sum): " + findSum3(arr, l1, r1, l2, r2));
        
        sc.close();
    }
}