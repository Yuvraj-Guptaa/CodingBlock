package onlinelec17;

public class String_demo_2 {
    public static void main(String[] args) {
        int n=1000000;
        String str="";
        long start=System.currentTimeMillis();
        for(int i=1;i<=n;i++)
        {
            str=str+1;
        }
        long end=System.currentTimeMillis();
        System.out.println((end-start)/1000.0);
    }
    
}
