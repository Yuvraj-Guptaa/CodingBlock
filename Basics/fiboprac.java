package Basics;

public class fiboprac {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        int i=2;
        System.out.print(a+" ");
        System.out.print(b);
        while(i<=10)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            i++;
            
        }
    }
    
}
