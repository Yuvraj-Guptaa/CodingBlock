package Lecture13;

public class string_demo {
    public static void main(String[] args) {
        String str="refer";
        // System.out.println(str.length());
        // System.out.println(str.charAt(0));
        
        System.out.println(isPalindrome(str));

    }
    public static boolean isPalindrome(String str)
    {
        String check=str;
        String str1="";
        for (int i = str.length()-1; i >= 0; i--) {
            str1+=str.charAt(i);
        }
       if(check.equalsIgnoreCase(str1))
       {
          return true;
       }
       return false;
    
    
}
}
