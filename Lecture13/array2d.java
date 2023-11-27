package Lecture13;

public class array2d {
    public static void main(String[] args) {
         int arr[][]={{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
         print(arr);
         //spiral(arr);
        //  wavyprint(arr);
        System.out.print(search(arr,41));
    }
   
    

public static void print(int arr[][])
{
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
            System.out.print(arr[i][j]+"\t");
            
        }
        System.out.println();
        
    }
}
public static void wavyprint(int arr[][])
{
    for (int i = 0; i < arr[0].length; i++) {
        if(i%2==0)
        {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i]+" ");
            }
          
        }
        else{
            for (int j = arr.length-1; j >= 0; j--) {
                System.out.print(arr[j][i]+" ");
                
            
            }
          


        }
        
    }
}
public static void spiral(int arr[][])
{
    int minRow=0;
    int minCol=0;
    int maxRow=arr.length-1;
    int maxCol=arr[0].length-1;
    int count=0;
    int tt=arr.length*arr[0].length;
    while(minCol<=maxCol&&minRow<=maxRow)
    {
        for(int c=minRow;c<=maxRow&&count<tt;c++)
        {
            System.out.print(arr[c][minCol]+" ");
            count++;
        }
        for (int i = minCol+1; i <=maxCol&&count<tt; i++) {
            System.out.print(arr[maxRow][i]+" ");
            count++;
            
        }
        for (int j = maxRow-1; j >= minRow&&count<tt; j--) {
            System.out.print(arr[j][maxCol]+" ");
            count++;
            
        }
        for (int j2 = maxCol-1; j2 >= minCol+1&&count<tt; j2--) {
            System.out.print(arr[minRow][j2]+" ");
            count++;
            
        }
        minCol++;
        minRow++;
        maxCol--;
        maxRow--;
    }
}
public static boolean search(int arr[][],int ali)
{
    int r=arr.length-1;
    int c=0;
    while(r>=0&&c<=arr[0].length-1)
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
