package onlinelec12_array3_sorting;

import java.util.Arrays;

public class surtting3 {
    public static void main(String[] args) {
        int arr[]={88,77,55,22,11};
        System.out.println(Arrays.toString(arr));
       // bubble(arr);
       //insertion(arr);
       selection(arr);
        System.out.println(Arrays.toString(arr));

        
    }
    public static void bubble(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
        for (int idx = 0; idx < arr.length-1; idx++) {
            if(arr[idx]>arr[idx+1])
            {
                int temp=arr[idx];
                arr[idx]=arr[idx+1];
                arr[idx+1]=temp;
            }
            
        }
    }
    
}
    public static void insertion(int arr[])
    {
        for(int count=0;count<=arr.length-2;count++)
        {
        int idx=count;
        int ele=arr[idx+1];
        while(idx>=0&&arr[idx]>ele)
        {
            arr[idx+1]=arr[idx];
            idx--;
        }
        arr[idx+1]=ele;
    }
}
public static void selection(int arr[])
{
    for(int count=1;count<=arr.length-1;count++)
    {
    int last=arr.length-count;
    int max=last;
    for(int i=0;i<=last;i++)
    {
            if(arr[max]<arr[i])
            {
                max=i;
            }
    }
    if(max!=last)
    {
    int temp=arr[last];
    arr[last]=arr[max];
    arr[max]=temp;
    }
}
}
}
