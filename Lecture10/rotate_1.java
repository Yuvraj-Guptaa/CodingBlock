package Lecture10;

public class rotate_1 {
    public static void print(int arr[])
    {
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void rotate(int arr[],int rot)
    { 
        rot=rot%arr.length;
        for(int r=0;r<rot;r++){
            int jeb=arr[arr.length-1];
        for (int i = arr.length-2; i >=0; i--) {
            arr[i+1]=arr[i]; 
            
        }
        arr[0]=jeb; 
    }}
    public static void rotateopti(int arr[],int rot)
    {    int cpy=rot;
        int end=arr.length-1;
         for (int start=0;start<end;   ){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
                 
            
         }
         rot=rot-1;
          for(int start=0;start<rot;)
          {
            int temp=arr[start];
            arr[start]=arr[rot];
            arr[rot]=temp;
            start++;
            rot--;   
          }
          
          end=arr.length-1;
          for(int start=cpy;start<end;)
          {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;   
          }


         

    }
    

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        print(arr);
        System.out.println(); 
      //  rotate(arr,2);
         rotateopti(arr,4);
        System.out.println();
        print(arr);
        
    }
    
}
