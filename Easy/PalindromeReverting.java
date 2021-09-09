class PalindromeReverting {
    public boolean isPalindrome(int x) {
//         If Negative value or last number=0 and first no doesn't starts with 0(simplyif last number is 0 it will return true when whole number is zero if not we candirectly say that number is not a palindrome.)
        if(x<0 ||(x%10==0 &&x!=0)){
            return false;
        }
        int revertedValue=0;
//         To get half value value of number so that we can iterate over that half values from last.
        for(int i=(String.valueOf(x).length())/2;i>0;i--){
//          Modulo value is then multiplied with Power of 10 and then added to last value
            lastValue=lastValue+x%10*(int)Math.pow(10,i-1);
            x/=10;
        }
//          For odd numbers we used x/10
        if(lastValue==x||lastValue==x/10){
            return true;
        }
        else{
            return false;
        }
    }
}
