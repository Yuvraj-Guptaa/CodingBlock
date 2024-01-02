package onlinelec12_array3_sorting;

public class sorting {
    public static void main(String[] args) {
        int arr[]={77,22,45,5,2,1};
        // bubblesort(arr);
        //selectionsort(arr);             
        insertionsort(arr);
        print(arr);
        
    }
    public static void print(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
    public static void bubblesort(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++) {//(if n-1 elements is sorted then n elements are also sorted)
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
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
        for(int idx=0;idx<=last;idx++)
        {
            if(arr[idx]>arr[max])
            {
                max=idx;
            }
        }
        if(max!=last)
        {
            int temp=arr[max];
                    arr[max]=arr[last];
                    arr[last]=temp;
        }
    }
}
public static void insertionsort(int arr[])
{
    for(int count=0;count<arr.length-1;count++)
    {
    int idx=count; 
    int lastele=arr[idx+1];
    while(idx>=0&&arr[idx]>lastele)
    {
        arr[idx+1]=arr[idx];
        idx--;
    }
    arr[idx+1]=lastele;
}
    
}
}
