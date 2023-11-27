package Recursion;

public class Rec1 {
    public static void printdec(int n)
    {
      if(n==1)   //smallest problem works
      {
       System.out.print(n); 
       return;
      }
      System.out.println(n); //bigger problem solved
      printdec(n-1); //smaller problem solved //assumes smaller problem works
    }
    public static void printinc(int n)
    {
        if(n==0)   //smallest problem worksb //base case
      {
       return;
      }

        printinc(n-1);
        System.out.println(n);

    }
    public static void decincre(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        decincre(n-1); //fn call ke baad bhasm hoga
        System.out.println(n); //nechee wali line chalegi bhasm hone ke baad
    } 

    public static void main(String[] args) {
        decincre(5);
        
    }
    
}
