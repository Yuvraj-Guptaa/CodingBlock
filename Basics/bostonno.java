package Basics;
import java.util.*;
public class bostonno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=2;
        int pro=1;
        while(i<N)
        {
            if(N%2==0||N%3==0)
            {
                pro=pro*i;
            }
            N=N/i;
        
        }
        System.out.println(pro);
        
    }
    
}
