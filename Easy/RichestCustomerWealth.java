class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSumRow=0;
        for(int i=0;i<accounts.length;i++){
            int sumInd=0;
            for(int j=0;j<accounts[i].length;j++){
                sumInd+=accounts[i][j];
            }
            if(sumInd>maxSumRow) 
                maxSumRow=sumInd;
        }
        return maxSumRow;
    }
}
