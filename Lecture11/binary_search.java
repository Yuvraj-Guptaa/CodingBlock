package Lecture11;

public class binary_search {
    public static void main(String[] args) {
        
        int arr[]={10,20,30,40,50};
        System.out.println(Find(arr, 20));
    }
    public static int Find(int arr[],int key)
    {
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(key==arr[mid])
            {
                return mid;
            }
            else if(key>arr[mid])
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }

        }
        return -1;
    }
    
}
