package Basics;
import java.util.*;
public class ladderif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input marks");
        int marks=sc.nextInt();
        if(marks>=90)
        {
            System.out.println("A");
        }
        else if(marks>=80&&marks<90)
        {
            System.out.println("B");
        } 
        else if(marks>=70&&marks<80)   
        {
            System.out.println("C");
        }

        else if(marks>=60&&marks<70)
        {
            System.out.println("D");
        }

        else if(marks>=50&&marks<60)
        {
            System.out.println("E");
        }
        else
        {
            System.out.println("F");
        }

       sc.close();
    }
    
}
