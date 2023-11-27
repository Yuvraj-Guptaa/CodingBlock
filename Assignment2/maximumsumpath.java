package Assignment2;
import java.util.*;


public class maximumsumpath {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr1[]=new int[m];
        int arr2[]=new int [n];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.print(solve(arr1, arr2, m, n));

    }
    public static int solve(int arr1[], int arr2[], int m, int n) {
        int i = 0;
        int j = 0;
        int sumA = 0;
        int sumB = 0;
        int ans = 0;
    
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                sumA += arr1[i];
                i++;
            } else if (arr2[j] < arr1[i]) {
                sumB += arr2[j];
                j++;
            } else {
                ans += Math.max(sumA, sumB) + arr1[i];
    
                sumA = 0;
                sumB = 0;
                i++;j++;
                
            }
        }
    
        while (i < m) {
            sumA += arr1[i];
            i++;
        }
    
        while (j < n) {
            sumB += arr2[j];
            j++;
        }
    
        ans += Math.max(sumA, sumB);
    
        return ans;
    }
    
      
}