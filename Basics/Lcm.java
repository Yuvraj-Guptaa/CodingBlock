package Basics;
import java.util.*;
public class Lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N1=sc.nextInt();//4
        int N2=sc.nextInt();//6
        int i=2;
        int max=Math.max(N1,N2);
        int pro=1;
        while(i<max)
        {
            if(N1%i==0&&N2%i==0)
            {
               pro=pro*i;
               N1=N1/i;
               N2=N2/i;
            }
             else if(N1%i!=0&&N2%i==0)
            {
               pro=pro*i;
               N2=N2/i;
            }
             else if(N1%i==0&&N2%i!=0)
            {
               pro=pro*i;
               N1=N1/i;
            }
            
            else{
                i++;
            }
        }
        System.out.println(pro);
        
    }
    
}
