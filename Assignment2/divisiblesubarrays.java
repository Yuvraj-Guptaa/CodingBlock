package Assignment2;

public class divisiblesubarrays {
    public static void main(String[] args) {
        
        int arr[]={4,5,0,-2,-3,1};
        System.out.println(divsubarray(arr));
        System.out.println(sumdivisblebyK(arr, arr.length));
    }
    public static long divsubarray(int arr[])
    {
        int N=arr.length;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for (int j = i; j <arr.length ; j++) {
                 
                 sum=sum+arr[j];
                 if(sum%N==0)
                 {
                    count+=1;
                 }
                 
                
            }
            
            
            
            
        }
        return count;
    }
    public static long sumdivisblebyK(int arr[],int k)
    {
        int prefixsum[]=new int[k];
        int sum=0;
        int ans=0;
        int rem=0;
        for(int ali:arr)
        {
             
            sum+=ali;
            rem=sum%k;
           
            if(rem==0)
            {
                ans++;
            }
            else if(rem<0)
            {
                rem=rem+k;
            }
            ans+=prefixsum[rem];
            prefixsum[rem]++;
        }
        return ans;

    }
    
}
