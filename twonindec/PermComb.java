package twonindec;

public class PermComb {
    
    public static void main(String[] args) {
        int n=3;
        int r=2;
        // perm(r,"",n,new boolean[n]);
        // comb(r,-1, n, "");
        comb2(0, n, r, "");
        
    }

public static void perm(int toPick,String path,int totalBoxex,boolean []boxes)
{
    if(toPick==0)
    {
        System.out.println(path);
       
        print(boxes);
        return;
    }
    for(int i=0;i<totalBoxex;i++)
    {
        if(boxes[i]==false)
        {
        //pick ith box
        boxes[i]=true;//prep jo maine ne part ke jaane se phele ki thi
        perm(toPick-1, path+"b"+i, totalBoxex,boxes);
        boxes[i]=false;//undo prep
    }
}}
public static void print(boolean arr[])
{
   for(boolean b:arr)
   {
    if(b)
    {
        System.out.print("#"+" ");
    }
    else{
        System.out.print("."+" ");
    }
   }
   System.out.println();
   System.out.println("=========");
}//with respect to pt teacher
public static void comb(int toPick,int prev,int totalBox,String path)
{
    if(toPick==0)
    {
        System.out.println(path);
        return;
    }
    for(int i=prev+1;i<totalBox;i++) 
    {
        comb(toPick-1,i, totalBox, path+"b"+i);
        prev++;
    }
}
//wrt to seat//student
public static void comb2(int curr, int totalBox, int totalQ, String path) {
    if (totalQ == 0) {
        System.out.println(path);
        return;
    }
    if (curr == totalBox) {
        return;
    }
    comb2(curr + 1, totalBox, totalQ - 1, path + "Q" + curr);
    comb2(curr + 1, totalBox, totalQ, path);
}


}