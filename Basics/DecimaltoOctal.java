package Basics;

import java.util.Scanner;

public class DecimaltoOctal {
     public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String S="";
        while(N>0)
        {
            if(N<=8)
            {
                  S=String.valueOf(N)+S;
                  break;
            }
            else{
                S=String.valueOf(N%8)+S;
                N=N/8;
                
            }


        }
        System.out.print(S);
        
        // Your Code Here
    }
    
}
