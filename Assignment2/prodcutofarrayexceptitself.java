package Assignment2;
import java.util.*;
class productofarrayexeptitself
{
   public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        long arr[]=new long[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }  
        product(arr);
}
public static void product(long arr[])
    {
       
        long result;
        long k[]=new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
             long leftp=1;
             long rigthp=1;
            for (int j = 0; j < i; j++) {
                leftp=leftp*arr[j];
            }
            for (int j = i+1; j < arr.length; j++) {
                rigthp=rigthp*arr[j];
            }
            result=leftp*rigthp;
            k[i]=result;
          
        }
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(k[i]+" ");
        }
          
    }
          
    }
