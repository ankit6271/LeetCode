// 1) Using for Loop
// class Solution {
//     public int numIdenticalPairs(int[] nums) {
//         int goodPair=0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j] && i<j){
//                     goodPair++;
//                 }
//             }
//         }
//         return goodPair;
//     }
// }

// 2) Using HashMap to store keyvalue pairs and  if a number appears n times, then n * (n – 1) / 2 good pairs can be made with this number. (Nc2 combination)
import java.util.*;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> h =new HashMap<Integer,Integer>();
        for(int i:nums){
            if(h.containsKey(i)){
                int storedValue=h.get(i)+1;
                h.put(i,storedValue);
            }
            else{
                 h.put(i,1);
            }
        }
        Collection c =h.values();
        Iterator i=c.iterator();
        int sum=0;
        while(i.hasNext()){
            int value=(int)i.next();
            sum+=value*(value-1)/2;
        }
        return sum;
    }
}
