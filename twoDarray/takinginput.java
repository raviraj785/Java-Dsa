import java.util.Scanner;

public class takinginput {
    static void printarray(int [][] arr){
        for(int i= 0; i<arr.length ;i++){
            for(int j =0;j<arr[i].length ;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter The  Number Of Row ");
            int r = sc.nextInt();
            System.out.println("Enter The Number of Column");
            int c = sc.nextInt();
            int arr1 [] [] = new int[r][c];
            int arr_2 [] [] = new int[r][c];
                int sum [] [] = new int[r][c];
   
   

            System.out.println("Enter 1st "+ r*c+ " Element");
            for(int i= 0; i<r; i++){
                for(int j = 0; j<c; j++){
                    arr1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter 2nd "+ r*c+ " Element");
            for(int i= 0; i<r; i++){
                for(int j = 0; j<c; j++){
                    arr_2[i][j] = sc.nextInt();
                }
            }
            for(int i =0; i<r;i++){
                for(int j =0; j<c; j++){
                    sum[i][j]= arr1[i][j] +arr_2[i][j];
                }
            }
        printarray(sum);
    }
}
