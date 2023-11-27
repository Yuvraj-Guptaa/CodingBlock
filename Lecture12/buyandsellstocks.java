package Lecture12;

import java.util.Scanner;

public class buyandsellstocks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
        System.out.println(bands(arr));
        
    }
    // public static int bands(int arr[])
    // {
    //     int min=Integer.MAX_VALUE;
    //     int idx=0;
    //     for (int i = 0; i < arr.length; i++) {
    //         if(min>arr[i])
    //         {
    //             min=arr[i];
    //             idx=i;
    //         }
    //     }
    //     int max=Integer.MIN_VALUE;
    //     for (int i = idx; i < arr.length; i++) {
    //         if(max<arr[i])
    //         {
    //             max=arr[i];
    //         }

            
    //     }
    //     int profit=max-min;
    //     return profit;
    // }
    public static int bands(int arr[])
    {
        int maxprofit=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                sum=arr[j]-arr[i];
                if(sum>maxprofit)
                {
                    maxprofit=sum;
                }
                
            }
        }
        return maxprofit;
    }
    
}
