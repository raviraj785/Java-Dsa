public class two_D_Arrayfirst {
    public static void printArray(int [] []arr){
        for(int i =0;i<arr.length;i++){
            //If yyou want to print 1 d array to tum sout(arr[i]) likh saskte ho lekin tumko 2-D arrayprint karna h to dusra loop lagana padega 
            for(int j= 0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
         
        }
    }
    public static void main(String[] args) {
        int [] [] arr= { {1,2,3,},
                        {4,5,6},
                        {7,8,9}
                        };
                        printArray(arr);
    }
}
