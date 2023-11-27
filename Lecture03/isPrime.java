package Lecture03;

import java.util.Scanner;

public class isPrime {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int div=1;
        int numofFac=0;
        while(div<=n)
        {
            int R=n%div;
            System.out.println(div+"-"+R);
            if(R==0)
            {
                numofFac=numofFac+1;
            }

            div=div+1;
        }
        System.out.println(numofFac);
        if(numofFac==2)
        {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
      }
      
    
}
