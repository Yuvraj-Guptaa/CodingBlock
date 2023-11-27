package Assignment2;

import java.util.Scanner;
public class MaximuncircularSum {
 
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int test=1;test<=t;test++)
        {
        int arr[]=new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        
        
       solve(arr);

    }
    }
    public static void solve(int arr[])
    {
        int straightmax=kadancemodified(arr);
        int totalsum=0;
        for(int i=0;i<arr.length;i++)
        {
            totalsum+=arr[i];
            arr[i]=-1*(arr[i]);
        }
        int invertkdance=kadancemodified(arr);
        int ans=Math.max(straightmax,(totalsum+invertkdance));
        System.out.println(ans);
    }
    public static int kadancemodified(int arr[])
    {
        int sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(sum<0)
            {
                sum=0;
            }
            
            
            max=Math.max(sum,max);
           
            
      
        }
        return max;
    }
}