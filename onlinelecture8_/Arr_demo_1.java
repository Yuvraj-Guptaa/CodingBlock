package onlinelecture8_;

public class Arr_demo_1 {
    public static void main(String[] args) {
        int n=5;
        int arr[]=new int[n];
       // arr=null;
        System.out.println(arr);//arr stores the address
        //array ka size?
        int size=arr.length;
        System.out.println(size);
        //array ka ith index?!
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[arr.length-1]); //out of index is runtime error
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[arr.length-1]);
        System.out.println("===============");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i*2;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
        System.out.println();
        System.out.println("======================");
        //Enhanced loop ya for each loop
        for(int val:arr)
        {
            System.out.print(val+" ");
        }
        System.out.println();
    }
    
}
