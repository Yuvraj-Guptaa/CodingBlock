package Recursion;

public class hwrecarr {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        // printarr1(0, arr);
        // printarr3(0,arr.length-1, arr);
        // reversearr(arr, 0);
        System.out.println(factorial(5));
        
    }
    public static void printarr1(int s,int arr[])
    {
        if(s==arr.length-1)
        {
            System.out.println(arr[s]);
            return;
        }
        System.out.println(arr[s]);
        printarr1(s+1, arr);

    }
    public static void printarr2(int e,int arr[])
    {
        if(e==0)
        {
            System.out.println(arr[e]);
            return;
        }
        printarr2(e-1, arr);
        System.out.println(arr[e]);
    }
    public static void printarr3(int s,int e,int arr[])
    {
        if(s>e)
        {
            return; //dry run home
        }
        int mid=(s+e)/2;
        printarr3(s, mid-1, arr);
        System.out.println(arr[mid]);
        printarr3(mid+1, e, arr);
    
    }
    public static void reversearr(int arr[],int s){
        if(s==arr.length-1)
        {
            System.out.println(arr[s]);
            return;
        }

        reversearr(arr, s+1);
        System.out.println(arr[s]);
    }
    public static int factorial(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int factorial=factorial(n-1);
        return n*factorial;
    }

    
}
