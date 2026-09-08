public class Kinghtissafe {

     static  int maxKnights = -1;
     static int number = 8;
     public static  boolean isSafe(char board [][] ,int row , int col){
        int n= board.length;
        int i , j;
        // 2 Up 1 Right 
        i = row -2;
        j= col +1;
        if(i >= 0 && j < n && board[i][j] =='K') return false;
        // 2 Up 1 left 
        i = row -2;
        j= col - 1;
        if(i >= 0 && j >= 0 && board[i][j] =='K') return false;
        // 2 Down 1 Right 
        i = row + 2;
        j= col +1;
        if(i < n && j < n && board[i][j] =='K') return false;
        // 2 Down 1 left 
        i = row +2;
        j= col -1;
        if(i < n && j >=0  && board[i][j] =='K') return false;

        //  2 Right 1 up
        i = row-1;
        j = col +2;
         if(i >= 0 && j <n  && board[i][j] =='K') return false;
         // 2 Right 1 down 
         i = row +1;
         j = col + 2;
         if(i < n && j < n && board[i][j] =='K') return false;

        //  2 left 1 up
        i = row-1;
        j = col -2;
         if(i >= 0 && j >=0  && board[i][j] =='K') return false;

         // 2 left 1 down 
         i = row +1;
         j = col - 2;
         if(i < n && j >= 0 && board[i][j] =='K') return false;
         return true;
     }
     public static void nKnight(char[][] board, int row, int col , int num ){
        int n  = board.length;
            if (row == n) {
                if (num == number){
                for(int i = 0 ; i < n ;i++){
                    for(int j = 0 ;j < n ;j++){
                        System.out.print(board[i][j]);
                    }
                     System.out.println();
                }
               System.out.println();
            }
            maxKnights = Math.max(maxKnights, num);
                return ;
            }
            if(isSafe(board, row, col)){ // Is Safe
                board[row][col] = 'K';
               if(col != n-1) nKnight(board, row, col+1, num+1);
               else nKnight(board, row+1, 0, num+1);
               board[row][col] ='x'; // This Is fucking BackTracking

            }
             // when Not Safe
                 if(col != n-1) nKnight(board, row, col+1, num);
                 else nKnight(board, row+1, 0, num);
            
     }
    public static void main(String[] args) {
        int n = 4;
         char board [][] = new char [n][n];
         for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                board[i][j] ='x';
            }
         }
         nKnight(board,0,0,0);
         System.out.println(maxKnights);
    }
}
