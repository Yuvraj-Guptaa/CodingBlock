package Hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class demo_HM {
    public static void main(String[] args) {
        // HashMap<Key,Value> HM = new HashMap<>();
        HashMap<String,Integer> HM = new HashMap<>();
        HM.put("A", 10); // O(1)
        HM.put("B", 15);
        HM.put("l2", 16);
        HM.put("Az", 10); // O(1)
        HM.put("aB", 15);
        HM.put("Cl2", 16);
        
        HM.put("chomu", null);
        
        System.out.println(HM);
        System.out.println( HM.get("chomu"));

        System.out.println( HM.get("A"));

        System.out.println(HM.containsKey("chomu"));

        System.out.println(HM.remove("chomu"));
                
        System.out.println(HM);
        HM.put("A", 20);
        System.out.println(HM);
        // System.out.println(HM.key);
        Set <String> Keys = HM.keySet();
        for(String K : Keys){
            System.out.println(K+ "=>"+HM.get(K));
        }    
        // int[] arr ={1,4,2,3,4,0};
        // findDuplicate(arr);
        int[] arr = {5,7,6,2,8,10,11,1,0,3};
        longestConsChain(arr);
    }
    public static Integer findDuplicate(int[]arr){
        // HashMap<array ka number , Freq>
        HashMap<Integer, Integer> HM =new HashMap<>();
        for(int ali : arr){
            int prev_freq = 0;
            if(HM.containsKey(ali)){
                return ali;

                // prev_freq = HM.get(ali);
            
            }
            HM.put(ali, prev_freq+1);
        }
        System.out.println(HM);
        return null;
    }
    public static void longestConsChain(int[]arr){
        HashSet<Integer> HS = new HashSet<>();
        for(int ali : arr){
            HS.add(ali);
        }
        for(int ali : arr){
            // if(ali -1 is NOT in my HashMap){
            if(!HS.contains(ali-1)){
                // ali  is your startin element!!
                // System.out.println(ali);
                int temp = ali;
                while(HS.contains(temp)){
                    System.out.print(temp+ " ");
                    temp++;
                }
                System.out.println();
            }
        }
    }
    
}
