package Lecture12;

import java.util.Scanner;

public class icecream {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
           
        }
         System.out.println(lightest(arr));
    }
    public static int lightest(int arr[])
    {
        int min=Integer.MAX_VALUE;
        int dessert_menu_number=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
            {
                   min=arr[i];
                   dessert_menu_number=i;
            }
        }
        return dessert_menu_number+1;
    }
    
}
