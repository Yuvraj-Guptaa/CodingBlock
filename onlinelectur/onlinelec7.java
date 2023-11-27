package onlinelectur;

import java.util.Scanner;

public class onlinelec7 {
    public static void farehtocelci(int minF,int maxF,int Step)
    {
        int celcuis=0;
        for(int i=0;i<=maxF;i=i+Step)
        {
            //celcuis=(5.0/9.0)*(i-32);
            celcuis=(5*(i-32)/9);//because 9/5 result to 0 thats we use this
            System.out.println(i+"\t"+celcuis);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input MinF");
        int minF=sc.nextInt();
        System.out.println("Input MaxF");
        int maxF=sc.nextInt();
        System.out.println("Input Step");
        int Step=sc.nextInt();
        farehtocelci(minF,maxF, Step);
        
    }
    
}
