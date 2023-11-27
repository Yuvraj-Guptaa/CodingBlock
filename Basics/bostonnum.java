package Basics;

import java.util.Scanner;

public class bostonnum {
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sumofd=0;
        int sumofp=0;
        int i=2;
        int N1=N;
        int copy=N;
        int pro=1;
        while(N>0)
        {
            int d=N%10;
            sumofd=sumofd+d;
            N=N/10;
        }
       
        while(pro<copy)
        {
            if(N1%i==0)
            {
                  sumofp=sumofp+i;
                  pro=pro*i;
                  N1=N1/i;
            }
            else
            {
                i++;
            }
        }
        System.out.println(sumofp);
        if(sumofd==sumofp)
        {
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }


        

    }
}
