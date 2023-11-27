package Assignment2;

import java.util.*;
import java.util.Arrays;

public class targetsumtriplet {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int arr[]=new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        tripletsum(arr, target);
        
    }
    public static void tripletsum(int arr[],int target)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int j2 = j+1; j2 < arr.length; j2++) {
                    if(arr[i]+arr[j]+arr[j2]==target)
                    {
                        System.out.println(arr[j]+", "+arr[j2]+" and "+arr[i]);
                    }
                    
                }
            }
        }
    }
    
}
// import java.util.*;
// import java.util.Arrays;
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         int arr[]=new int[sc.nextInt()];
//         for(int i=0;i<arr.length;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         int target=sc.nextInt();
//         tripletsum(arr,target);


//     }
//      public static void tripletsum(int arr[],int target)
//     {
//         Arrays.sort(arr);

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 int start=j;
//                 int end=arr.length-1;
//                 while(start<=end)
//                 {
//                     int mid=start+(end-start)/2;
//                     if (mid < 0 || mid >= arr.length) {
//                             break;
//                         }
//                     if((target-(arr[i]+arr[j]))==arr[mid])
//                     {
//                         System.out.println(arr[i]+", "+arr[j]+" and "+arr[mid]);
                    
//                     }
//                     else if(target-(arr[i]+arr[j])>arr[mid])
//                     {
//                         end--;
//                     }
//                     else
//                     {
//                         start++;
//                     }
//                 }
                    
//                 }
//             }
//         }
//     }


