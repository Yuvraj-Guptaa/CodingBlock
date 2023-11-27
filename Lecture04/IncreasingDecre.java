package Lecture04;

import java.util.Scanner;

public class IncreasingDecre {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=1;
        int current=0;
        boolean checkdec=true,checkinc=true;
        while(i<=N)
        {
            i++;
            int S=sc.nextInt();
            if(current>=S)
            {
                 current=S;
                 checkdec=true;
            }
            else{
                current=S;
                checkdec=false;
                checkinc=true;

            }

        }
        

    }
    
}
