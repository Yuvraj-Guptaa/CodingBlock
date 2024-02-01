package Recursion2Dboard;

public class blocked_maze {
    public static void main(String[] args) {
        int [][]board={{0,1,0,0},
                       {0,0,0,0},
                       {0,1,0,0},
                       {0,0,1,0},
                      };
                        move(0, 0, "", board,new boolean[4][4]);
        
    }
    public static void move(int r,int c,String path,int board[][],boolean visited[][])
    {
        if(r==board.length-1&&c==board[0].length-1)
        {
            System.out.println(path);
            return;
        }
        if(c==board[0].length)
        {
           return;
        }
        else if(r==board.length||r<0||c<0||visited[r][c])
        { 
            return;
        }
        else if(board[r][c]==1)
        {
            return;
        }
        visited[r][c]=true;
        move(r-1, c, path+"U", board,visited);//up
        move(r+1, c, path+"D", board,visited);//down
        move(r, c-1, path+"L", board,visited);//left
        move(r, c+1, path+"R" , board,visited);//right  
        visited[r][c]=false;
    }
    
}
