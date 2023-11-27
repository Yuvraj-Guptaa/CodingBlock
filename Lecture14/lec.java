package Lecture14;

public class lec {
    public static void main(String[] args) {
        // String str="hello paaji balle balle aaja";
        // System.out.println(str.length());
        // System.out.println(str.startsWith("ab"));
        // System.out.println(str.endsWith("cd"));
        // System.out.println(str.indexOf("paaji"));//first occurnce ka starting index 
        String str="nitin";
        // String str1="the sky is blue";
        // printAllSubstring(str);
       // wordextraction(str1);
       //deleteindex(str, 2);
       printAllSubstringPalind(str);
    }
    public static void grow(String str,int L,int R)
    {
        while(L>=0&&R<str.length())
        {
            if(str.charAt(L)==str.charAt(R))
            {
                //L se R paindrome
                System.out.println();
            }
        }
    }
    
        public static void wordextraction(String str)
        {
            while(true)
            {
                int i=str.lastIndexOf(" ");
                
                String word=str.substring(i+1);
                System.out.println(word);
                if(i==-1)
                {
                    break;
                }
                str=str.substring(0, i);
                
            }

        }
        public static void deleteindex(String str,int i)
        {
            String str1=str.substring(0,i);
            String Str2=str.substring(i+1);
            System.out.println(str1+Str2);
        }
        public static boolean isPalindrome(String str)
        {
            int i=0;
            int j=str.length()-1;
            while(i<j)
            {
                if(str.charAt(i)!=str.charAt(j))
                {
                    return false;
                }
                i++;
                j--;
                
        }
        return true;
            
    }
    public static void printAllSubstringPalind(String str)
    {
        for (int i = 0; i < str.length(); i++) {
            
            for (int j = i+1; j <=  str.length(); j++) {
                String s=str.substring(i, j);
                if(isPalindrome(s))
                {
                    System.out.println(s);
                }
                    
                }
            }
        }

}
    
    

