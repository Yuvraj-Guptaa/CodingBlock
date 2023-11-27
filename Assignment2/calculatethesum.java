package Assignment2;
import java.util.*;
public class calculatethesum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        //rotate(arr, 1);
        
        int T=sc.nextInt();
        for(int i=1;i<=T;i++){
            int X=sc.nextInt();
        sum(arr, X);

        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum%((int)Math.pow(10,9)/7));
        sc.close();
        
    }
   public static void revarray(int arr[],int i,int j)
   {
    while(i<j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
   }
   public static void rotate(int arr[],int X)
   {
    revarray(arr, 0, arr.length-1);
    revarray(arr, 0,X-1);
     revarray(arr, X, arr.length-1);
   }
   public static void sum(int arr[],int X)
   {

     int copyarr[]=Arrays.copyOf(arr, arr.length);
    rotate(arr, X);
    for (int i = 0; i < copyarr.length; i++) {
        arr[i]=arr[i]+copyarr[i];
    }
}
}


