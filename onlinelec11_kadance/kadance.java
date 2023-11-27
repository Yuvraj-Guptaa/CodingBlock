package onlinelec11_kadance;
public class kadance {
    public static void main(String[] args) {
        int arr[]={100,200,-310,50,5,-99999};
        // SubArr(arr);
        kadancee(arr);
        


    }
    public static void kadancee(int arr[])
    { 
            int sum=0;
            int ans=0;
            
            for (int i = 0; i < arr.length; i++) {
                sum+=arr[i];
                if(sum<0)
                {
                    sum=0;
                }
                ans=Math.max(ans,sum);
            }
            System.out.println("Maximum subarray is ->"+ans);
    }
    public static void SubArr(int arr[])
    { int max=Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                
                sum=sum+arr[j];
                if(max<sum)
                {
                    max=sum;
                }
        System.out.println(" --> "+sum);
            }
            System.out.println("break line");
            
        
        }
        System.out.println("Maximum subarray sumis- "+max);
    }
    // public static int sum(int arr[],int s,int e)
    // {
    //     for (int i = s; i <=e; i++) {
    //         System.out.print(arr[i]+" ");
            
    //     }
    //     System.out.println();
    // }
    public static int sum(int arr[],int s,int e)
    {
        int sum=0;
        for (int i = s; i <=e ; i++) {
            sum=sum+arr[i];
            
        }
        return sum;
    }
    
}
