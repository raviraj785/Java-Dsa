

import java.util.Scanner;

public class printspiralorder {

    static void printarray(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void spiralarray(int arr[][], int r, int c){
        int topRow = 0, bottomRow = r - 1;
        int leftCol = 0, rightCol = c - 1;
        int totalElements = 0;

        while (totalElements < r * c) {

            // Top Row
            for (int j = leftCol; j <= rightCol && totalElements < r * c; j++) {
                System.out.print(arr[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            // Right Column
            for (int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                System.out.print(arr[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            // Bottom Row
            for (int j = rightCol; j >= leftCol && totalElements < r * c; j--) {
                System.out.print(arr[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            // Left Column
            for (int i = bottomRow; i >= topRow && totalElements < r * c; i--) {
                System.out.print(arr[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter " + (r * c) + " elements:");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Array:");
        printarray(arr);

        System.out.println("Spiral Order:");
        spiralarray(arr, r, c);
    }
}