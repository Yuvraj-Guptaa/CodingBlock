package Assignment2;

import java.util.Arrays;

public class sort01 {
    public static void main(String[] args) {
        int arr[]={1,1,0,0,1,1,0,1};
        System.out.println(Arrays.toString(arr));
        sort(arr);
         System.out.println(Arrays.toString(arr));

    }
    public static void sort(int arr[])
    {
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i]==0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
    
}
