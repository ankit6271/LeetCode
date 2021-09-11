                                                        // https://leetcode.com/problems/count-of-smaller-numbers-after-self/

//  1) Time level exceeding for large array.

// import java.util.*;
// class Solution {
//     public List<Integer> countSmaller(int[] nums) {
//         Integer [] smallNumberArray = new Integer [nums.length];
//         for(int i=0;i<nums.length;i++){
//             int smallerCount=0;
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[j]<nums[i]){
//                     smallerCount++;
//                 }
//             }
//             smallNumberArray[i]=smallerCount;
//         }
//         return Arrays.asList(smallNumberArray);
//     }
// }

//  2) Wrong answer as I am using linked hash set making it remove redundant also which can be less than that partcular elemnt.

// import java.util.*;
// class Solution {
//     public List<Integer> countSmaller(int[] nums) {
//         Integer [] smallNumberArray = new Integer [nums.length];
//         for(int i=0;i<nums.length;i++){
//             int smallerCount=0;
//             LinkedHashSet <Integer> lsh =new LinkedHashSet<Integer>();
//             for(int j=i+1;j<nums.length;j++){
//                 lsh.add(nums[j]);
//             }
//             if(lsh.size()!=0){
//                 Object[] LHSArray = lsh.toArray();
//                 if((Integer)LHSArray[0]==nums[i]){
//                     lsh.remove(nums[i]);
//                 }
//                 Iterator iter=lsh.iterator();
//                 while(iter.hasNext()){
//                     if((Integer)iter.next()<nums[i])
//                         smallerCount++;
//                 }
//                 smallNumberArray[i]=smallerCount;
//             }
//             else{
//                     smallNumberArray[i]=0;

//             }
//         }
//         return Arrays.asList(smallNumberArray);
//     }
// }
