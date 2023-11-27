package Lecture9;
import java.util.*;
public class lowerupper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0); //ek word leta hai sc.next
        if(ch>='a'&&ch<='z')
        {
            System.out.println("Lower");
        }
         else if(ch>='A'&&ch<='Z')
        {
            System.out.println("Upper");

        }
        else
        {
            System.out.println("pata nahi kya bol raha");
        }

    
    sc.close();
    
}
}
