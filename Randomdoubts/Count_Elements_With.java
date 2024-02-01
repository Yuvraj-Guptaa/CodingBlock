package Randomdoubts;

import java.util.Arrays;

public class Count_Elements_With {
    public static void main(String[] args) {
        int nums[] = {15};
        Count_Elements_With obj=new Count_Elements_With();
        System.out.println(obj.maxFrequencyElements(nums));
        
    }
    public int maxFrequencyElements(int[] nums) {
        int max=0;
        int ans=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        int count[]=new int[max+1];
        max=0;

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;

            
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i]>max)
            {
                max=count[i];
            }
            
        }
        for (int i = 0; i < count.length; i++) {
            if(max==count[i])
            {
                ans+=max;
            }
        }
        System.out.println(Arrays.toString(count));


        return ans;
        
        
    }
    
}
