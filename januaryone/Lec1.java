package januaryone;

public class Lec1 {
    public static void main(String[] args) {
        int [][] board={
            {0,1,0,0},
            {0,0,0,0},
            {0,1,0,0},
            {0,0,1,0}
        
    };
    move(0, 0, "", board);
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
        place(r, c+1, QTP, path+"Q{}"+r, tR, tC);
        place(r, c+1, QTP, path, tR, tC);
    }
    public static void move(int r,int c,String path,int [][]board)
    {
     if(r==board.length-1&&c==board[0].length-1)
     {
    System.out.println(path);
    return;
     }
       
       if(r==board.length||c==board[0].length||board[r][c]==1||r<0||c<0)
       {
        return;
       }
        
        move(r-1, c, path+"U", board);//up
        move(r+1, c, path+"D", board);//down
        
        move(r, c-1, path+"L", board);//left
        move(r, c+1, path+"R", board);//right

    }
    
}
