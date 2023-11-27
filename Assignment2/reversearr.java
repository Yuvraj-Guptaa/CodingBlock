package Assignment2;

import java.util.Arrays;

public class reversearr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        fun(arr, 0, arr.length);
    }
    public static void fun(int arr[],int i,int j)
    {
        int start=i;
        int end=j-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            
        }
        System.out.println(Arrays.toString(arr));
    }

    
}
