package januaryone;

public class Lec1 {
    public static void main(String[] args) {
        int [][] board={
            {0,1,0,0},
            {0,0,0,0},
            {0,1,0,0},
            {0,0,1,0}
        
    };
    move(0, 0, "", board,new boolean[board.length][board[0].length]);
}
    public static void place(int r,int c,int QTP,String path,int tR,int tC)
    {
        if(QTP==0)
        {
            System.out.println(path);
            return;
        }
        if(c==tC)
        {
            r++;
            c=0;
        }
        place(r, c+1, QTP-1, path+"Q{}"+r, tR, tC);
        place(r, c+1, QTP, path, tR, tC);
    }
    public static void move(int r, int c, String path, int[][] board, boolean[][] Visited) {
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] == 1 || Visited[r][c]) {
            return;  // Invalid position, return without exploring
        }
    
        if (r == board.length - 1 && c == board[0].length - 1) {
            System.out.println(path);
            return;  // Reached the bottom-right corner, print the path
        }
    
        Visited[r][c] = true;
    
        move(r - 1, c, path + "U", board, Visited);  // up
        move(r + 1, c, path + "D", board, Visited);  // down
        move(r, c - 1, path + "L", board, Visited);  // left
        move(r, c + 1, path + "R", board, Visited);  // right
    
        Visited[r][c] = false;  // Backtrack by marking the current position as not visited
    }
    
    
}
