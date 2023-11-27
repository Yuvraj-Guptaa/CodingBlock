package Basics;

import java.util.Scanner;

public class test {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int N2=sc.nextInt();
        int i=1;
        int c=1;
        while(c<=n)
        {
            int N1=(3*i)+2;
            if(N1%N2!=0)
            {
                System.out.println(N1);
                c++;
            }
            i++;
        }

    }
    
}
