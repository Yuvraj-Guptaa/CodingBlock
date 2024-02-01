package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class Stack_Qps {
    public static void main(String[] args) {
        int arr[]={50,30,20,40,10,45,5,60,15,8};
        nextGrater2(arr);
    }
    public static void nextGrater(int arr[])
    {
        Stack<Integer>S=new Stack<Integer>();//potential A's
        for(int B:arr)
        {
            //tu kis kis ka next greater hai
            while(!S.isEmpty()&&S.peek()<B)
            {
                int A=S.pop();
                System.out.println(A+" -> "+B);
            }
            S.add(B);
        }
    }
    public static void nextGrater2(int arr[])
    {
        Stack<Integer>S=new Stack<Integer>();//potential A's
        int ans[]=new int[arr.length];
        int i=0;
        for(int B:arr)
        {
            //tu kis kis ka next greater hai
            while(!S.isEmpty()&&arr[S.peek()]<B)
            {
                int A_idx=S.pop();
                ans[A_idx]=B;
                System.out.println(arr[A_idx]+" -> "+B);
            }
            S.add(i);
            i++;
        }
        System.out.println(Arrays.toString(ans));
    }
    
}
