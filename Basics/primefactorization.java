package Basics;
import java.util.*;
class primefactorization
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=2;
        int pro=1;
        int copy=num;
        int counter=-1;
        while(pro<copy)
        {
            if(num%i==0)
            {
                if(i!=counter)
                {
                    System.out.print(i+" ");
                   

                }
                 pro=pro*i;
                    num=num/i;
                    counter=i;
            }
                else
                {
                    i++;
                }
            }
        }
    }
