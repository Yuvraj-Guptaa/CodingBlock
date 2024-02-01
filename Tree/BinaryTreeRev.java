package Tree;

public class BinaryTreeRev {
    class Node{
        public Node(int i) {
            data=i;
        }
        int data;
        Node left;
        Node right;
    }
    Node root;
    public void print()
    {
        print(root);
    }
    private void print(Node nn) {
        //		BP => 10k!!
                if(nn==null) {
                    return;
                }
                String str = "";
                if(nn.left !=null) {
                    str = str + nn.left.data;
                }
                str = str + "=>" + nn.data+ "<=";
                if(nn.right !=null) {
                    str = str + nn.right.data;
                }
                System.out.println(str);
                print(nn.left);
                print(nn.right);
                
            }
    public BinaryTreeRev(int pre[],int in[] )
    {
        root=createInPre(pre, 0,pre.length-1,in,0,in.length-1);
    }
    private Node createInPre(int[] pre, int ps, int pe, int[] in, int is, int ie) {
        if(ps>pe||is>ie)
        {
            return null;
        }
        Node nn=new Node(pre[ps]);
        int f=-1;
        int Left_size=0;
        for(int i=is;i<=ie;i++)
        {
            if(in[i]==nn.data)
            {
                f=i;
                break;
            }
            Left_size++;
        }
        nn.left=createInPre(pre, ps+1, ps+Left_size, in, is, f-1);
        nn.right=createInPre(pre, ps+Left_size+1, pe, in, f+1, ie);
        return nn;
        
        
    }

    
}
