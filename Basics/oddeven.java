package Basics;

public class oddeven {
    public static void evenodd(int num)
    {
        if(num%2==0)
        {
            System.out.println("It is even");

        }
        else
        {
            System.out.println("It is odd");
        }
    }
    public static void main(String[] args) {
        // int num=17;
        // int Q=num/2;
        // int R=num%2;                                                       
        // System.out.println(Q+"  "+R);
        evenodd(-4);
    }
    
}
