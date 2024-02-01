package Hashmap;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class BinaryTree {
 class Node {
		public Node(int i) {
			// TODO Auto-generated constructor stub
			data = i;
		}

		int data;
		Node left;
		Node right;

	}

	Node root;

	public void print() {
		print(root);
	}

	private void print(Node nn) {
//		BP => 10k!!
		if (nn == null) {
			return;
		}
		String str = "";
		if (nn.left != null) {
			str = str + nn.left.data;
		}
		str = str + "=>" + nn.data + "<=";
		if (nn.right != null) {
			str = str + nn.right.data;
		}
		System.out.println(str);
		print(nn.left);
		print(nn.right);

	}

	
public BinaryTree(int[] lvl, boolean b) {
		root = createLvl(lvl);
	}

	private Node createLvl(int[] lvl) {
		Node nn = new Node(lvl[0]);
		int idx = 1;
		Queue<Node> Q = new LinkedList<>();
		Q.add(nn);
		while (!Q.isEmpty()) {
			Node curr = Q.poll();
			// System.out.println(curr.data);
			if (idx < lvl.length && lvl[idx] != -1) {
				curr.left = new Node(lvl[idx]);
				Q.add(curr.left);
			}
			idx++;
			if (idx < lvl.length && lvl[idx] != -1) {
				curr.right = new Node(lvl[idx]);
				Q.add(curr.right);
			}
			idx++;

		}
		return nn;
	}
    public void vertical(){
        Queue<Integer> axisQ = new LinkedList<>();
        Queue<Node> nodeQ = new LinkedList<>();
        nodeQ.add(root);
        axisQ.add(0);
		HashMap<Integer, ArrayList<Integer>> HM = new HashMap<>();
        while(!nodeQ.isEmpty()){
            Node nn = nodeQ.poll();
            int axis = axisQ.poll();
            // System.out.println(nn.data + " -> "+axis);
			// =============================
			ArrayList<Integer> AL = new ArrayList<>();
			if(HM.containsKey(axis)){
				AL = HM.get(axis);
			}
			AL.add(nn.data);
			HM.put(axis, AL);
			// ===========================
            if(nn.left!=null){
                nodeQ.add(nn.left);
                axisQ.add(axis-1);
            }
            if(nn.right!=null){
                nodeQ.add(nn.right);
                axisQ.add(axis+1);
            }    
        }
		// System.out.println(HM);
		TreeSet<Integer> Keys = new TreeSet<>(HM.keySet());
		// System.out.println(Keys);
		
		for(int K: Keys){
			System.out.println(HM.get(K));
		}
		
    }
   
}
