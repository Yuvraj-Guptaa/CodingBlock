package twosixthDecember;

public class Playinggoodstring {
    public static void main(String[] args) {
        System.out.println(solve("cbaeicde"));
        
    }
    public static int solve(String str)
    {
        int ans=0;
        int score=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(isVowel(ch))
            {
                score++;
            }
            else{
                score=0;
            }
            ans=Math.max(ans,score);
            
        }
        return ans;
    }
    public static boolean isVowel(char ch) {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            return true;
        }
        return false;
    }
    
}
