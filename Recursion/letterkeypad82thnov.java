package Recursion;

public class letterkeypad82thnov {
    public static void main(String[] args) {
        solve("23", "");
        
    }

    public static void solve(String buttons,String path)
    {
        //BP:button"689"
        //SP:button:"89"
        if(buttons.length()==0)
        {
            System.out.print(path+" ");
            return;
        }
        String sp=buttons.substring(1);//89
        char button=buttons.charAt(0);//'6'
        String options=fn(button);//"mno"
        for(int i=0;i<options.length();i++)
        {
            solve(sp,path+options.charAt(i));
        }
    }
    public static String fn(char button)
    {
           String arr[]={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
           return arr[button-'0'];//whenever we do operations on character we get int
    }


    
}
