class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int [] targetArray=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-2;j>=index[i];j--){
                targetArray[j+1]=targetArray[j];
            }
            targetArray[index[i]]=nums[i];
        }
        return targetArray;
    }
}
