package Queue;

public class Q1 {
    int arr[];
    int s=0;
    int size=0;
    public Q1(int cap)
    {
        arr=new int[cap];
    }
    public Q1()
    {
        this(5);
    }
    public void add(int ali)
    {
        int idx=(s+size)%arr.length;
        arr[idx]=ali;
        size++;
    }
    public int poll()
    {
        int ans=arr[s];
        s++;
        size--;
        return ans;
    }
    
}
