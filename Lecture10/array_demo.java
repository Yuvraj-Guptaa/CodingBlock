package Lecture10;
public class array_demo
{
    public static void main(String[] args) {
        int arr[]=new int[10];
        // System.out.println(arr);
        // System.out.println(arr.length);//size
        // System.out.println(arr[0]); //accessing element  //ye int hai ya int array// ye int hai
        // arr[0]=2;
        // arr[1]=4;
        // arr[2]=6;
        // arr[3]=8;
        // System.out.println(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(i+1)*5;
            
        }
        for (int  i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
           
    }
}