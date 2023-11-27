package Lecture11;

public class rotate2 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        rotateopp(arr, 1);
        print(arr);

        
    }
    public static void print(int arr[])
    {
        
        for (int i : arr) {  //Enhanced loop
            System.out.print(i+" ");
        }
    }
    public static void rev(int i,int j,int arr[])
    {
             
               while(i<j)
               {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
               }
    }
    public  static void rotateopp(int arr[],int rot)
    {
        rev(0, arr.length-1, arr);
        rev(0, rot-1, arr);
        rev(rot, arr.length-1, arr);

    }


    
}
