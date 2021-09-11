//                                       https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/submissions/

// class Solution {
//     public int[] smallerNumbersThanCurrent(int[] nums) {
//         int [] smallNumberArray = new int [nums.length];
//         for(int i=0;i<nums.length;i++){
//             int smallerCount=0;
//             for(int j=0;j<nums.length;j++){
//                 if(nums[j]<nums[i]){
//                     smallerCount++;
//                 }
//             }
//             smallNumberArray[i]=smallerCount;
//         }
//         return smallNumberArray
//     }
// }

// 2) Performance is somewhat less in memory not runtime.
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] smallNumberArray = new int [nums.length];
        int [] sortedArray =Arrays.copyOf(nums,nums.length);
        Arrays.sort(sortedArray);
        // IntStream boxed() returns a Stream consisting of the elements of this stream, each boxed to an Integer. as here Arrays.asList() no working necause of sortedaRRAY OF int NOT integer.
        List<Integer> sortedArrayList=Arrays.stream(sortedArray).boxed().collect(Collectors.toList() );
        for(int i=0;i<nums.length;i++){
            int count=0;
            int position=sortedArrayList.indexOf(nums[i]);
            for(int j=position;j>0;j--){
                count++;
            }
            smallNumberArray[i]=count;
        }
        return smallNumberArray;
    }
}
