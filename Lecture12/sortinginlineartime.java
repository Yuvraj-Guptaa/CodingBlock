package Lecture12;
import java.util.*;
public class sortinginlineartime {
    public static void main(String args[]) {
         Scanner scn=new Scanner(System.in);
        int n = scn.nextInt(); 
         int[] arr=new int[n];
           for (int i = 0; i < n; i++) 
            arr[i]=scn.nextInt();
            sortColors(arr); 
           for (int i = 0; i < arr.length; i++){
              System.out.print(arr[i]+" ");
           }
    }
    public static void sortColors(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
    {
        if(max<nums[i])
        {
            max=nums[i];
        }

    }
        int freq2=0;
        int freq1=0;
        int freq0=0;
        int temp[]=new int[max+1];
        for (int i = 0; i < temp.length; i++) {
           if(temp[nums[i]]==2)
           {
            freq2++;
           }
           else if(temp[nums[i]]==1)
           {
            freq1++;
           }
           else 
           {
            freq0++;
           }
        }
        for (int i = 0; i < nums.length; i++) {
            if(freq0>=0)
            {
                nums[i]=2;
            }
            if(freq2>=0)
            {
                nums[i]=2;
            }
            if(freq2>=0)
            {
                nums[i]=2;
            }
            
        }

        // Write your code here
    }
}