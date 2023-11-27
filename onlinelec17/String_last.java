package onlinelec17;

import java.util.Scanner;


public class String_last {
    Scanner sc=new Scanner(System.in);
    //next() word one by one
    //nextLine() fullsentence
    public static void main(String[] args) {
        
    
    String str="abcd";
     System.out.println(str.length());
     System.out.println(str.charAt(0));
     ////////////////////
     System.out.println(str.startsWith("ab"));
     System.out.println(str.endsWith("cd"));
     ////////////////////
     System.out.println(str.indexOf("abcd"));
     System.out.println(str.lastIndexOf("abcd")); //beginning index from last
     ////////////////////
     System.out.println(str.substring(0, 3));
     System.out.println(str.substring(5));
     ///////////////////
     char []arr=str.toCharArray();
     //System.out.println(arr);
     String str2="the sky is pink";
     String[]arr1=str2.split(" ");
     ////////////////////
     


}
}
