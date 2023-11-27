package Assignment2;

public class increasingdecreasing {
    public static void main(String[] args) {
        
    }
    public static void solve(String str)
    {
        int [] arr=new int[str.length()+1];
        int ans=1;
        int cnt_ds=0;
        for(int i=0;i<=str.length();i++)
        {
            if(i==str.length()||str.charAt(i)=='I')
            {
                int idx=i;
                for(int cnt=1;cnt<=cnt_ds+1;cnt++)
                {
                    arr[idx]=ans;
                    idx--;
                    ans++;
                }
                // I
                // arr[i]=ans;
                // ans++;
                cnt_ds=0;

            }
            else if(str.charAt(i)=='D')
            {
                cnt_ds++;
            }
        }
    }
    
}
