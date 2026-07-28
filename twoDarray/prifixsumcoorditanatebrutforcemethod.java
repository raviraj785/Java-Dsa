import java.util.Scanner;

public class prifixsumcoorditanatebrutforcemethod {
    public static int  findsum (int [][] arr , int l1 , int r1 , int l2, int r2){
        int sum = 0; 

        for(int i = l1 ; i <= l2; i++ ){
            for(int j = r1 ; j<= r2 ; j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Row And Column");
        int r= sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter "+r*c+ "Element");
          int arr[][] = new int [r][c];
        for(int i = 0; i<r;i++){
            for(int j = 0 ;j <c; j++){
                arr[i] [j] = sc.nextInt();
            }
        }
        System.out.println("Enter l1 And r1 And l2 And r2");
          int  l1 = sc.nextInt();
          int r1 = sc.nextInt();
          int l2 = sc.nextInt();
          int r2 = sc.nextInt();
         
          System.out.println("Sum Is " + findsum(arr, l1, r1, l2, r2));

    }
}
