package onlinelec12_array3_sorting;
import java.util.Arrays;
public class surtting2 {
    public static void main(String[] args) {
         int arr[]={88,66,55,44,22};
         System.out.println(Arrays.toString(arr));
        //  bubblesort(arr);
        //selectionsort(arr);
        insertionsort(arr);
         System.out.println(Arrays.toString(arr));
    }
    public static void bubblesort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
        for (int idx = 0; idx < arr.length-1; idx++) {
            //bubble ?? idx and idx+1
            if(arr[idx]>arr[idx+1])
            {
                int temp=arr[idx];
                arr[idx]=arr[idx+1];
                arr[idx+1]=temp;
            }

            
        }

    }
    
}
    public static void selectionsort(int arr[])
    {
        for(int count=1;count<arr.length;count++)
        {
        int last=arr.length-count;
        int max=last;
        for (int i = 0; i  <=last; i++) {
               if(arr[max]<arr[i])
               {
                max=i;
               }
            
        }
        //chawp!!
        //max with last index
        if(max!=last)
        {
        int temp=arr[last];
        arr[last]=arr[max];
        arr[max]=temp;
        }
    }
}
    public static void insertionsort(int arr[])
    {
        for(int count=0;count<=arr.length-2;count++)
        {
      int idx=count;//kahan se kahan tak array sorted hai
      int ele=arr[idx+1];//kahan element hai vo
      while(idx>=0&&arr[idx]>ele)
      {
        arr[idx+1]=arr[idx];
        idx--;
      }
      arr[idx+1]=ele;
    }
}
}
