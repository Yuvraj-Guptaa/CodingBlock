package Stacks;

public class S_client {
    public static void main(String[] args) {
        S1 S=new S1();
        S.add(10);
        S.add(20);
        S.add(30);
        S.add(40);
        S.add(50);
        Rev(S);
        S.print();
    }
    public static void Rev(S1 S)
    {
        S1 E1=new S1();
        while(!S.isEmpty())
        {
            E1.add(S.pop());
        }
        S1 E2=new S1();
        while(!E1.isEmpty())
        {
            E2.add(E1.pop());
        }
        while(!E2.isEmpty())
        {
            S.add(E2.pop());
        }
    }
    
    
}
