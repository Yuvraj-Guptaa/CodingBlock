package Lecture12;

import java.util.Arrays;
import java.util.*;
public class pairofroses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            t--;
            
        }



        
    }
    public static void solve(int arr[],int target)
    {
        Arrays.sort(arr);
        int L=0;
        int R=arr.length-1;
        int L_rose=-1;
        int R_rose=-1;
        while(L<R)
        {
            if(arr[L]+arr[R]==target)
            {
                L_rose=arr[L];
                R_rose=arr[R];
                L++;
                R--;
            }
            else if(arr[L]+arr[R]>target)
            {
                R--;
            }
            else if(arr[L]+arr[R]<target)
            {
                L++;
            }
        }
        
    }
    
}
