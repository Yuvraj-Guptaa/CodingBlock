package Basics;

    import java.util.*;
public class simpleinput {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(sum>=0)
        {
            
            int n=sc.nextInt();
            sum=sum+n;
            
            if(sum<0)
            {
                break;
            }
            System.out.println(n); 
           
        
        }

    }
}
    
