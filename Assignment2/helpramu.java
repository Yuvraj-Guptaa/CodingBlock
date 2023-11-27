package Assignment2;
import java.util.*;
public class helpramu {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>=0)
        {
        int c1=sc.nextInt();
        int c2=sc.nextInt();
        int c3=sc.nextInt();
        int c4=sc.nextInt();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int ai[]=new int[n];
        int bi[]=new int[m];
        for(int i=0;i<n;i++)
        {
            ai[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            bi[i]=sc.nextInt();
        }
    helpramumoney(ai, bi, c1, c2, c3, c4);
    t--;
        }

    }
    public static void helpramumoney(int ai[],int bi[],int c1,int c2,int c3,int c4)
    {
        int total_cost_rick=0;
        int total_cost_cabs=0;
        int tr=0;
        for(int i=0;i<ai.length;i++)
        {
            tr+=(Math.min(ai[i]*c1,c2));

        }
        total_cost_rick=Math.min(tr,c3);
        int br=0;
        for(int i=0;i<bi.length;i++)
        {
            br+=(Math.min(bi[i]*c1,c2));

        }
        total_cost_cabs=Math.min(br,c3);
         System.out.print(Math.min(total_cost_cabs+total_cost_rick,c4));
       
    }
    
}
    

