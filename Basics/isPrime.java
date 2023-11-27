package Basics;

public class isPrime {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        int count=0;
        while(i<=n)
        {
            if(n%i==0)
            {
                count++;
            }
            
            i++; 
        }
        if(count==2)
        {
            System.out.println("It is a prime number");
        }
        else
        {
            System.out.println("It is not a prime number");
        }
    }
    
}
