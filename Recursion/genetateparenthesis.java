package Recursion;

public class genetateparenthesis {
    public static void main(String[] args) {
        solve(2, 2, "");
    }
    public static void solve(int op,int cl,String path)
    {
        if(op==0&&cl==0)
        {
            System.out.println(path);
            return;
        }
        if(op>cl)//that means closed brackets are more(-ve base case)
        {
            return;
        }
        if(op>0)//warna negative cahala jayega value
        {
        solve(op-1, cl, path+"(");
       
    }
    if(cl>0)//warna negative cahala jayega value
    {
 solve(op, cl-1, path+")");
    }
}
    
}
