class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean [] resultArray=new Boolean [candies.length];
        int max=0;
        for(int i=0;i<candies.length;i++){
            max=candies[i]>max ?candies[i] : max;
            candies[i]=candies[i]+extraCandies;
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]>=max){
                resultArray[i]=true;
            }
            else{
                resultArray[i]=false;
            }
        }
        return Arrays.asList(resultArray);
    }
}
