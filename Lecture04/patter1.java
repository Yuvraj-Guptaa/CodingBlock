package Lecture04;

import java.util.*;

public class patter1 {
    public static void p1(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p1(n);

    }

}
