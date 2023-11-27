package Basics;
 import java.util.*;
public class Oddevenc {
       public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=1;
        int sumeven=0,sumodd=0;
        while(i<=N)
        {
            int Number=sc.nextInt();
            while(Number>0)
            {
                int d=Number%10;
                if(d%2==0)
                {
                    sumeven=sumeven+d;
                }
                else
                {
                    sumodd=sumodd+d;
                }
                Number/=10;
            }
            i++;
             if(sumeven%4==0||sumodd%3==0)
        {
            System.out.println("Yes");
            sumeven=0;
            sumodd=0;
        }
        else
        {
            System.out.println("No");
        }

        }
       

    }
}
    

