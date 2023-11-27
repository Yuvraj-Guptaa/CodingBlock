package Lecture13;
import java.util.*;
public class array_2d_demo {
    public static void main(String[] args) {
        
        // int [][]arr=new int[4][3];
        // // System.out.println(arr);
        // // System.out.println(arr.length);
        // for(int []row:arr)
        // {
        //     System.out.println(row);
        //     for(int ali:row)
        //     {
        //         System.out.print(ali+" ");
        //     }
        //     System.out.println();
        // }
        // arr[0][0]=1;
        // arr[0][1]=2;
        // arr[0][2]=3;
        // arr[0][3]=4;
        int arr[][]={{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
       // wavyprint(arr);
       spiral(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
    public static void twodarr(int arr[][])
    {
        int count=1;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=count;
                count++;
            }
        }
        sc.close();
    }
    public static void wavyprint(int arr[][])
    {
        // Scanner sc=new Scanner(System.in);
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        

        for (int c= 0; c < arr[0].length; c++) {
             {
                if(c%2==0)
                {
                for (int i = 0; i < arr.length; i++) {
                    
                
                System.out.print(arr[i][c]+" ");

            }
          
            
        }
        else{
            for (int i = arr.length-1; i >=0; i--) {
                    
                
                System.out.print(arr[i][c]+" ");

            }

        }
       
    }


    
}
}
public static void spiral(int arr[][])
{
    int minRow=0;
    int maxCol=arr[0].length-1;
    int minCol=0;
    int maxRow=arr.length-1;
    while(minRow<=maxRow&&minCol<=maxCol)
    {
        for(int r=minRow;r<=maxRow;r++)
        {
            System.out.print(arr[r][minCol]+" ");

        }
        System.out.println();
        for(int c=minCol+1;c<=maxCol;c++)
        {
            System.out.print(arr[maxRow][c]+" ");
        }
        System.out.println();
        for(int r=maxRow-1;r>=minRow&&minCol!=maxCol;r--)
        {
            System.out.print(arr[r][maxCol]+" ");
        }
        System.out.println();
        
        for(int c=maxCol-1;c>=minCol+1&&minRow!=maxRow;c--)
        {
            System.out.print(arr[minRow][c]+" ");
        }
        System.out.println();
        minCol++;
        minRow++;
        maxRow--;
        maxCol--;


    }
}
public static boolean findsorted(int arr[][],int ali)
{
    int r=arr.length-1;
    int c=0;
    while(r>=0&&c<arr[0].length)
    {
        if(arr[r][c]==ali)
        {
            return true;
        }
        else if(arr[r][c]<ali)
        {
            c++;
        }
        else if(arr[r][c]>ali)
        {
            r--;
        }
    }
    return false;
}
}
