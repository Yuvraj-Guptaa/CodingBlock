package Recursion2Dboard;

import java.util.ArrayList;
import java.util.List;

public class BoardComb {
    public static void main(String[] args) {
        int N=4;
        List<List<String>> AL = new ArrayList<>();
        chess(0, 0, N, "", new boolean[N][N],AL);
        System.out.println();
        
    }
    public static void chess(int r,int c,int QTP,String path,boolean board[][] ,List<List<String>> AL)
    {
        if(QTP==0)
        {
            // System.out.println(path);
            List<String> LL = MakeUp(board); 
            AL.add(LL);
            // print(board);
            return;
        }
        if(c==board[0].length)//next row condition
        {
            r++;
            c=0;
        }
        if(r==board.length)
        {
            return; 
        }
        if(isSafe(r,c,board))
        {
        board[r][c]=true;
       
        chess(r, c+1, QTP-1, path+"Q{"+r+","+c+"}", board,AL);
        board[r][c]=false;
        }
        chess(r, c+1, QTP, path, board,AL);
        
    }
    private static boolean isSafe(int r, int c, boolean[][] board) {

        for(int R=0;R<r;R++)//same column pe nahi hona chaiye
        {
            if(board[R][c])
            {
                return false;
            }
        }
         for(int C=0;C<c;C++)//same row pe nahi honi chaiye
        {
            if(board[r][C])
            {
                return false;
            }
        }
        int R0=r;
        int C0=c;
        while(R0>=0&&C0>=0)
        {
             if(board[R0][C0])
            {
                return false;
            }
            R0--;
            C0--;
        }
         int R1=r;
        int C1=c;
        while(R1>=0&&C1<board[0].length)
        {
             if(board[R1][C1])
            {
                return false;
            }
            R1--;
            C1++;
        }
        return true;
    }
    private static void print(boolean[][] board) {
        for(boolean []row:board)
        {
            for(boolean b:row)
            {
                if(b)
                {
                    System.out.print("[Q]");
                }
                else{
                    System.out.print("[_]");
                }
            }
            System.out.println();
        }
        System.out.println("=============");
    }
    
}
