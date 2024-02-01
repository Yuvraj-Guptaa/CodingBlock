package Assignment2;

import java.util.Scanner;

public class Alexgoesshopping {
    public static void main(String args[]) {
        Scanner scn =new Scanner(System.in);
       
        int n=sc.nextInt();
         int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        for(int i=1;i<=q;i++)
        {
            int A=sc.nextInt();
            int k=sc.nextInt();
            shopping(arr, A, k);
        }
        
       

    }
    public static void shopping(int arr[],int A,int k)
    {
        int freq=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==A)
            {
               freq++;
            }
            else
            {
                if(A%arr[i]==0)
                {
                    freq++;
                }
            }
            
        }
        if(freq>=k)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
    
}
