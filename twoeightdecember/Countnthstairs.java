package twoeightdecember;

public class Countnthstairs {

    public static void main(String[] args) {
        Comb(0, 1, "", 4);
        
    }
    public static void Comb(int curr,int prev,String path,int dest)
    {
        if(curr==dest)
        {
            System.out.println(path);
            return;
        }
        if(curr>dest)
        {
            return ;
        }
          if(prev==1)
          {          Comb(curr+1, 1, path+1, dest);
                     Comb(curr+2, 2, path+2, dest);
    }
    if(prev==2)
    {
        Comb(curr+2, 2, path+2, dest);
    }

    
}
public static char ConvertStringtoChar(String str)
{
    int l=Integer.parseInt(str);
    return (char)('a'+l-1);
}
}