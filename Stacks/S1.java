package Stacks;

public class S1 {
     int arr[];
  int top;
   public S1(int cap)
   {
         arr=new int[cap];
         top=-1;
   }
   public S1()
   {
    this(5);
   }
    public boolean isEmpty()
    {
        return top==-1;
    }
    public  int size()
    {
        return top+1;
    }
    public  boolean isFull()
    {
        return size()==arr.length;
    }
    public void add(int ali)
    {
        if(isFull())
        {
            throw new RuntimeException("Bhai kya daal raha hai");
        }
        else if(top==-1)
        {
            top++;
            arr[top]=ali; //First element
        }
        else
        {
            top++;
            arr[top]=ali;
        }
    }
    public int peek()
    {
        if(isEmpty())
        {
            throw new RuntimeException("Bhai kya dekh raha hai");//Abstraction
        }
        else{
            return arr[top];
        }
    }
    public int pop()
    {
        if(isEmpty())
        {
           throw new RuntimeException("Bhai mre kya nikal raha hai");
        }
        else{
            int ans=arr[top];
            top--;
            return  ans;
        }
    }
    public void print()
    {
        System.out.print("[");
        int i=0;
        for(;;)
        {
            if(i<top)
            {
                System.out.print(arr[i]+" ");

            }
            else if(i==top){
                System.out.print(arr[i]);

            }
            else{
                System.out.print("]");
                break;
            }
            i++;

        }
    }
    
}
