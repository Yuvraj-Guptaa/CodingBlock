package Assignment2;
    import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
public class intersection {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        arrayinter(arr1,arr2);

        // Your Code Here
    }
    public static void arrayinter(int arr1[],int arr2[])
    {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
       // ArrayList<Integer>list=new ArrayList<Integer>();
        int j=0;
        int i=0;
        while(i<arr1.length)
        {
            if(arr1[i]==arr2[j])
            {
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
            else if(arr2[j]>arr1[i])
            {
                i++;
            }
            else if(arr1[i]>arr2[j])
            {
                j++;
            }
        }
        


     
    }
}

