package Recursion2Dboard;

import java.util.ArrayList;

public class ListofList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> biggy =  new ArrayList<>();
        ArrayList<Integer> AL = new ArrayList<>();
        AL.add(10);
        biggy.add(AL);
        System.out.println(biggy);

        AL.add(20);
        biggy.add(AL);
        System.out.println(biggy);

        AL.add(30);
        biggy.add(AL);
        System.out.println(biggy);

    }
}
