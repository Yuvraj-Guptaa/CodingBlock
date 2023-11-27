package Recursion;

public class recarraybasic {

    public static void print(int s,int arr[])
    {
     //bp:p(0,4)
     //sp(1,3)
     if(s==arr.length)
     {
        return;
     }
     System.out.println(arr[s]);
     print(s+1,arr);
    }
    public static void print2(int e,int arr[])
    {
        //BP(e,arr) //ending hai ye
        //SP(e-1,arr)
        if(e==0)
        {
            System.out.println(arr[0]);
            return;
        }
        print2(e-1, arr);
        System.out.println(arr[e]);
    }
    public static void print3(int s,int e,int arr[])
    {
        if(s>e)
        {
            return; //dry run home
        }
        int mid=(s+e)/2;
        print3(s, mid-1, arr);
        System.out.println(arr[mid]);
        print3(mid+1, e, arr);
    }
    public static void revarr(int s,int arr[])
    {
        if(s==arr.length)
        {
            return;
        }
        //BP:rev(s,arr)
        //SP:rev(s+1,arr)

        revarr(s+1, arr);
        System.out.println(arr[s]);
    }
    public static int Fact(int n)
    {
        //BP=n!
        //Sp=n-1!
        if(n==1)
        {
            return 1;   
        }
        int sp=Fact(n-1);
        return sp*n;
    }   
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        print2(arr.length-1, arr);
        
    }
    
}
