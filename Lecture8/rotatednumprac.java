package Lecture8;

import java.util.Scanner;

public class rotatednumprac {
    public static int rotatenum(int num,int count,int rot)
    {
                 int divisor=(int)Math.pow(10,rot);
                 int part1=num/divisor;
                 int part2=num%divisor;
                 int multiple=(int)Math.pow(10,count-rot);
                 return part2*multiple+part1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n1=num,count=0;
        while(num>0)
        {
            num/=10;
            count++;
        }
        System.out.println(rotatenum(n1, count, 1));
         System.out.println(rotatenum(n1, count, 2));
          System.out.println(rotatenum(n1, count, 3));
           System.out.println(rotatenum(n1, count, 4));

    }
    
}
