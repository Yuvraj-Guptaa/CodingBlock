package Recursion;

public class thnov27 {
    public static void main(String[] args) {
        // System.out.println(power(10, 2));
        System.out.println(fibonacci(6));
    }
    public static int power(int n,int power)
    {
        if(power==0)
        {
            return 1;
        }
        return n*power(n,power-1);
    }

    

public static int fibonacci(int n)
{
    if(n==0||n==1)
    {
        return n;
    }
    int sp1= fibonacci(n-1);
    int sp2=fibonacci(n-2);
    return sp1+sp2;

}
}
