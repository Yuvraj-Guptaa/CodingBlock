package Basics;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n;
        int copy=n;
        int count=0;
        int sum=0;
        while(n1>0)
        {
            count++;
            n1/=10;
        }
        while(n>0)
        {
            int d=n%10;
            sum=sum+(int)Math.pow(d,count);
            n=n/10;
        }
        if(sum==copy)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        
    }
    
}
