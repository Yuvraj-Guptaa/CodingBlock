package Stacks;

public class DynamicS1 extends S1 {
    @Override
    public void add(int ali) {
        
       if(isFull())
       {
        grow();
       }
       super.add(ali);
    }

     void grow() {
        int [] biggy=new int[arr.length*2];
        for(int i=0;i<=top;i++)
        {
            biggy[i]=arr[i];
        }
        arr=biggy;
    }
    
}
