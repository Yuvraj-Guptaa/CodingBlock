package onlinelec17;
public class seaofare
{
    public static void main(String[] args) {
        solve(20);
    }
    public static void solve(int n)
    {
        boolean[] isComposite=new boolean[n+1];
        // for(int num=2;num<=n;num++)
        // {
        //     System.out.println(isComposite[num]);
        // }
        for(int div=2;div*div<=n;div++)
        {
            //table of div
            if(isComposite[div])
            {
                continue;
            }
            for(int table=2*div;table<=n;table=table+div)
            {
                
                isComposite[table]=true;
            }
        }
        for(int num=2;num<=n;num++)
        {
            System.out.println(num+" composite status = "+isComposite[num]);
        }
    }
}