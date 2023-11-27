package onlinelec15;

import java.util.ArrayList;
import java.util.Collections;

public class mininumofoper {
    public static long makeSimilar(int[] nums, int[] target) {
    ArrayList<Integer>evennums=new ArrayList<>(nums.length);
      ArrayList<Integer>oddnums=new ArrayList<>(nums.length);
       ArrayList<Integer>eventarget=new ArrayList<>(target.length);
      ArrayList<Integer>oddtarget=new ArrayList<>(target.length);
      for (int i = 0; i < nums.length; i++) {
          if(nums[i]%2==0)
          {
              evennums.add(nums[i]);
          }
          else{
              oddnums.add(nums[i]);
          }
          
      }
      for (int i = 0; i < target.length; i++) {
          if(target[i]%2==0)
          {
              eventarget.add(target[i]);
          }
          else{
              oddtarget.add(target[i]);
          }
          
      }
      Collections.sort(evennums);
      Collections.sort(eventarget);
      Collections.sort(oddnums);
      Collections.sort(oddtarget);
      int originalevenumsize=evennums.size();
      int originaloddnumsize=oddnums.size();
     
      int diff=0;
      long opteration=0;
      for (int i = 0; i < originalevenumsize; i++) {
          if(evennums.get(i)!=eventarget.get(i))
          {
             diff += (evennums.get(i)-eventarget.get(i));
             if(evennums.get(i)>eventarget.get(i))
             {
                opteration +=(evennums.get(i)- eventarget.get(i))/2; 
             }
             
          }
      }
      for (int i = 0; i < originaloddnumsize; i++) {
          if(oddnums.get(i)!=oddtarget.get(i))
          {
             diff += ((oddnums.get(i)-oddtarget.get(i)));
          if(oddnums.get(i)>oddtarget.get(i))
             {
                System.out.println(oddnums.get(i)+""+ oddtarget.get(i));
                opteration +=(0l+oddnums.get(i)- oddtarget.get(i))/2;
             }
           
      }
      }
     
      if(diff==0)
      {
        return opteration;
      }
      else{
        return -1;
      }

  
}
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        int target[]={-1,5,8,1,2};
        long ans=makeSimilar(nums,target);
        System.out.println(ans);
        
    }
   
       
    }
    

