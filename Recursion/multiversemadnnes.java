package Recursion;

public class multiversemadnnes {
    public static void main(String[] args) {
        // coinToss(2, " ");
        climbstairs(0, "",3);
    }

    public static void coinToss(int n, String pattern) {
        if (n == 0) {
            System.out.println(pattern);
            return;
        }
        coinToss(n - 1, pattern + "H");
        coinToss(n - 1, pattern + "T");
    }
    public static void climbstairs(int curr,String path,int dest)
    {
        if(curr==dest) //+ve base case
        {
            System.out.println(path);
            return;
        }
        if(curr>dest) //-ve base case
        {
            return;
        }
        climbstairs(curr+1, path+1,dest);
        climbstairs(curr+2, path+2,dest);
    }
    public static void subsequence(String str,String path)
    {
        //BP:"abc",""
        //SP:"bc"
        String sp=str.substring(1);
        char ch=str.charAt(0);
        subsequence(sp, path+ch);
        subsequence(str, path);

     }

}
