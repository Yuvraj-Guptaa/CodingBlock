package Lecture9;
class fucntion_demo
{
    public static void naacho()
    {
        System.out.println("naccho");
        
    }
    public static int add(int a,int b) //int is the return type
    {
        return(a+b); //a and b are the local variables//return
    }
    public static void add(int a,int b,int c)
    {
        System.out.println(a+b+c); //a and b are the local variables
    }
    public static void main(String[] args) {
        //  naacho();
        // System.out.println("gaane");
        // naacho();
        System.out.println(add(2, 2));
        add(2, 2, 2);
        
    }
}