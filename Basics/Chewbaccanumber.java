package Basics;
    import java.util.*;
public class Chewbaccanumber{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        long rev=0;
        long mulitplier=1;
        while(x>0)
        {
           long d=x%10;
           if(9-d<d)
           {
               rev=rev+((9-d)*mulitplier);
           }
           else if(9-d==d||9-d>d||d==0)
           {
               rev=rev+((d)*mulitplier);
           }
           mulitplier=mulitplier*10;
           x=x/10;
        }
        System.out.println(rev);
        // for(int i=0;i<S.length();i++)
        // {
        //     char ch=S.charAt(i);
        //     if(ch!='0')
        //     {
        //         S1=S.substring(i);
        //         break;
        //     }
        // }
        // System.out.println(S1);
        // Your Code Here
    }
}

    

