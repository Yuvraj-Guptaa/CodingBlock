package onlinelec12_array3_sorting;

import java.util.Arrays;

public class surrting {
    public static void main(String[] args) {
        int arr[] = { 88, 66, 55, 44, 33, 22 };
        System.out.println(Arrays.toString(arr));
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i:arr)
        {
                System.out.println(i);
        }

    }

    public static void bubblesort(int arr[]) {
        for (int count = 0; count <= arr.length - 2; count++) {
            for (int idx = 0; idx <= arr.length - 2; idx++) {
                if (arr[idx] > arr[idx + 1]) {
                    int temp = arr[idx];
                    arr[idx] = arr[idx + 1];
                    arr[idx + 1] = temp;
                }
            }
        }
    }

    public static void selectionsort(int arr[]) {
        for (int count = 1; count < arr.length - 1; count++) {
            int last = arr.length - count;
            int max = last;
            for (int i = 0; i <= last; i++) {
                if (arr[i] > arr[max]) {
                    max = i;
                }
            }
            if (max != last) {
                int temp = arr[max];
                arr[max] = arr[last];
                arr[last] = temp;
            }
        }
    }

    public static void insertionsort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            
        

        int idx=i;
        int last_ele=arr[idx+1];
        while(idx>=0&&arr[idx]>last_ele)
        {
            arr[idx+1]=arr[idx];
            idx--;
        }
        arr[idx+1]=last_ele;



    }
}

}
