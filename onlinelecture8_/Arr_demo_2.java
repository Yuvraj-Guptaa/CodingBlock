package onlinelecture8_;

public class Arr_demo_2 {
    public static void main(String[] args) {
        int arr1[]=new int[5];
        int [] arr2=arr1;
        //ek hi ghar hai
        arr2[0]=10;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
    }
    
}
