package Basics;
import java.util.*;

public class replaceall {
        public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        String copy="";
        for (int i = 0; i < n.length(); i++) {
            char ch=n.charAt(i);
            if(ch=='0')
            {
                ch='5';
                
            }
            copy=copy+ch;
            
        }
        System.out.println(copy);
    
    }
}
    

