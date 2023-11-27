package Lecture10;

public class array_QPS {
    public static void main(String[] args) {
        int arr[]={1,20,31,12,7};
        // print(arr);
        // System.out.println(find(arr, 8));
        print(arr);
        rotate(arr, 2);
        System.out.println();
        print(arr);
    }
    public static void print(int arr[])
    {
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static int max(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static int find(int arr[],int ali)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==ali)
            {
                return i;
            }
        }
        return -1;
    }
    public static void rotate(int arr[],int rot)
    {
        int temp[]=new int[arr.length];
        for (int i = 0; i <=rot; i++) {
            temp[i]=arr[i];
            
        }
        for (int i = rot; i < arr.length; i++) {
            temp[i]=arr[i];
            
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=temp[i];
            
        }

    }
    
}
