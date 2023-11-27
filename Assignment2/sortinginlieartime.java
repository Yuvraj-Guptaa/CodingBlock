package Assignment2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class sortinginlieartime {
    public static void main(String args[]) {
         Scanner scn=new Scanner(System.in);
        int n = scn.nextInt(); 
         int[] arr=new int[n];
           for (int i = 0; i < n; i++) 
            arr[i]=scn.nextInt();
            sortColors(arr); 
        //    for (int i = 0; i < arr.length; i++){
        //       System.out.print(arr[i]+" ");
        //    }
    }
    public static void sortColors(int[] nums) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i])
            {
                max=nums[i];
            }
        }
        int count[]=new int[max+1];
       for (int i = 0; i < nums.length; i++) {
            count[nums[i]]+=1;
            
       }
       for (int i = 0; i < count.length; i++) {
        for (int j = 1; j <= count[i]; j++) {
            System.out.print(i+" ");
            
        }
       }
      

        
    }
    
}
