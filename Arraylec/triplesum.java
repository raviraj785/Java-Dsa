

import java.util.Scanner;
public class triplesum {
        public static int  sum(int []arr ,int x){
            int ans =0;
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    for(int k=j+1;k<arr.length;k++){
                if(arr[i]+ arr[j] +arr[k]==x){
                    ans++;
                }
            }
        }
    }
            return ans;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size OF AN ARRAY");
        int size = sc.nextInt();
        int arr[]= new int [size];

        System.out.println("Enter "+ size+ " Element");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter X ");
        int x= sc.nextInt();
        
        System.out.println("sum of X " + sum(arr ,x ));
    }
    
}


