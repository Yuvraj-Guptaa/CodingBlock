package linkedlist;

import java.util.Stack;

public class ll1 {
    public static void main(String[] args) {
        ll1 link = new ll1();
        link.addFirst(1);
        link.addLast(2);
        link.addLast(3);
        link.addLast(4);
        // link.reverse();
        //    link.Rev2();
        // link.revK();
        link.revK();
        link.print();

    }

    class Node {
        public Node(int data2) {
            data = data2;

        }

        int data;
        Node next;
    }

    Node head;

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int size() {
        Node temp = head;
        int size = 0;
        while (temp != null) {

            size++;
            temp = temp.next;
        }
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int get(int idx) {
        if (idx < 0 || idx >= size()) {
            throw new RuntimeException("out of found");

        } else {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;

        }
    }

    private Node getNode(int idx) {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int getFirst() {
        if (isEmpty()) {
            throw new RuntimeException("no elemetns in LL");
        }
        return head.data;
    }

    public int getLast() {
        Node temp = head;
        while (temp.next != null) {

            temp = temp.next;
        }
        return temp.data;
        // return get(size()-1);
    }

    public void addFirst(int data) {
        Node nn = new Node(data);
        nn.next = head;
        head = nn;

    }

    public void addLast(int data) {
        if (isEmpty()) {
            addFirst(data);
            return;
        }
        Node last = getNode(size() - 1);
        Node nn = new Node(data);
        last.next = nn;
    }

    public void addAt(int idx, int ali) {
        if (idx == 0) {
            addFirst(ali);
            return;
        } else if (idx == size()) {
            addLast(ali);
            return;
        }
        if (idx < 0 || idx > size()) {
            throw new RuntimeException("out of vound");
        }
        Node nn = new Node(ali);
        Node prev = getNode(idx - 1);
        Node after = prev.next;
        nn.next = after;
        prev.next = nn;
    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("khaali hai broo");
        }
        int data = head.data;
        head = head.next;
        return data;

    }

    public int removeLast() {
        if (size() == 0 || size() == 1) {
            return removeFirst();

        }
        Node secondLast = getNode(size() - 2);
        Node last = secondLast.next;
        secondLast.next = null;
        return last.data;
    }

    public int removeAt(int idx) {
        if (idx == 0) {
            return removeFirst();
        } else if (idx == size() - 1) {
            return removeLast();
        } else if (idx >= size() || idx < 0) {
            throw new RuntimeException("?");

        }
        Node prev = getNode(idx - 1);
        Node curr = prev.next;
        Node after = curr.next;
        prev.next = after;
        return curr.data;

    }

    public void reverse() {
        Node temp = head;
         Node prev = null;
        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        head=prev;

    }
    public void Rev2()
    {
        Rev2(head);
    }
    private Node Rev2(Node nn)
    {
        if(nn.next==null)
        {
            head=nn;
            return head;
        }
        
        Node Tail=Rev2(nn.next);
        Tail.next=nn;
        nn.next=null;
        return nn;
    }
    public void revK()
    {
        revK(head, 3);
    }
    private Node revK(Node nn,int k)
    {
        if(nn==null)
        {
            return null;
        }
        Node temp=nn;//head
        for(int i=0;i<k;i++)
        {
          //  System.out.println("times");
          if(temp==null)
          {
            return nn;
          }
            temp=temp.next;
        }
       Node head= revK(temp, k);
       Node curr=nn;
       Node prev=null;
    
       {
        Node after=curr.next;

        System.out.println(curr.data);
        curr.next=prev;
        prev=curr;
        curr=after;
       }
       nn.next=head;
       return prev;

    }
    public void revK_Iter(int K)
    {
        Node nhead=null;
        Node ntail=null;
        Stack<Node>S=new Stack<>();
        Node curr=head;
        while(curr!=null)
        {
            Node after=curr.next;
            S.add(curr);
            if(S.size()==K)
            {
                while(!S.isEmpty())
                {
                    Node nn=S.pop();
                    //this nn needs to be inseted at the end of my ll
                    if(nhead==null)
                    {
                        nhead=nn;
                        ntail=nn;
                        ntail.next=null;

                    }
                    else{

                        ntail.next=nn;
                        ntail=nn;
                        ntail.next=null;
                    }
                }
                //Empty the stack and isert the nodes in new LL
            }
            curr=after;
            

        }
        curr=nhead;
    }

}
