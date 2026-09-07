public class RatInDeadMazeInFourDir {
    public static void main(String[] args) {
        int rows = 3 ;
        int cols = 4;
       int [] [] maze ={ {1,0,1,1},
                         {1,1,1,1},
                         {1,1,0,1},
                         };
                          boolean [] [] isVisited = new boolean[rows][cols];  // By default -> false
                         print(0, 0, rows-1, cols-1, "", maze ,isVisited);
    }
    private static void print(int sr , int sc , int er , int ec ,String s , int [][] maze , boolean [][] isVisited){
        if (sr <0 || sc < 0) return ;
        if (sr > er || sc > ec) return ;
            if (sr==er && sc==ec) {
                System.out.println(s);
                return ;
            }
            if (maze[sr][sc] ==0 ) {
                return ;
            }
            if (isVisited[sr][sc] == true) return ;
             isVisited[sr][sc] = true;
             // go Right 

             print(sr, sc+1, er, ec, s+"R",maze ,isVisited);
             // go Down 
             print(sr+1, sc, er, ec, s+"D",maze,isVisited);
             // Go left 
             print(sr, sc-1, er, ec, s+"L",maze,isVisited);
             // Go Up
             print(sr-1, sc, er, ec, s+"U",maze,isVisited);
              isVisited [sr] [sc] = false;
        
    }
}

