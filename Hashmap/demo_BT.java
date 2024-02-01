package Hashmap;

import java.util.LinkedList;
import java.util.Queue;

public class demo_BT {
public static void main(String[] args) {
    int[] arr = {10,20,30,40,50,60,70,80,90,100};
    BinaryTree BT = new BinaryTree(arr,false);
    // BT.print();
    BT.vertical();
}
}