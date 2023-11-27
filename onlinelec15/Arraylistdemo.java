package onlinelec15;

import java.util.ArrayList;

import Lecture04.primefactorization;

public class Arraylistdemo {
    public static void main(String[] args) {
        ArrayList<Integer>AL=new ArrayList<>();
        //Wrapper Integer->int wrapper class
        // System.out.println(AL);
        // System.out.println(AL.size());
        // //add in your AL
        AL.add(10);
        AL.add(20);
        AL.add(30);
        AL.add(40);
        AL.add(50);
        AL.add(60);
        // System.out.println(AL);
        // AL.add(2,25);
        // //indexing in my AL
    //     for(int i=0;i<AL.size();i++)
    //     {
    //     System.out.println(AL.get(i));


    // }
    for(int ali:AL)
    {
        System.out.println(ali);
    }
    //Delete karna sikhao
    //left shift honge
    
}
    
}
