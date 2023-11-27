package Lecture11;

public class subarray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        //subarr(arr);
       // maxsubarr(arr);
       maxsubarron(arr);
    }
    
    public static void subarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for (int j = i; j <arr.length ; j++) {
                for (int j2 = i; j2 <=j; j2++) {
                    System.out.print(arr[j2]+" ");
                    
                }
                System.out.println();
                // System.out.println(i+"  "+j);
                
            }
            
            
            
        }
    }
    public static void maxsubarron2(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for (int j = i; j <arr.length ; j++) {
                 
                 sum=sum+arr[j];
                 
                
            }
            System.out.println(sum);
            
            
            
        }
    }
     public static void maxsubarron(int arr[])
    {    int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            ans=Math.max(ans,sum);//for all negative elements
           if(sum<0)
           {
            break;
           }
           ans=Math.max(ans,sum);
            
            
            
        }
        System.out.println(ans);
    }
    
    
}
