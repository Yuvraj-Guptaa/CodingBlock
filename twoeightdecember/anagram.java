package twoeightdecember;

import Basics.sumofnatural;

public class anagram {
    public static void main(String[] args) {
        anagramm("abc", "");
        
    }
    public static void anagramm(String word,String ana)
    {
        int n=word.length();
        if(n==0)
        {
            System.out.println(ana);
        }
       
        for(int i=0;i<n;i++)
        {
            char ch=word.charAt(i);
             anagramm(word.substring(0, i)+word.substring(i+1,n), ana+ch);

             
        }

    }

    
}
