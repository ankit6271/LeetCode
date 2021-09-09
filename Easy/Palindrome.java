class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String prevString=Integer.toString(x);
        StringBuffer b=new StringBuffer(prevString);
        String revString=b.reverse().toString();
        // int y=Integer.parseInt(revString);   Cant use this as y is not getting actual value of revString as exceeding the value of (2power31-1)
        if(prevString.equals(revString)){
            return true;
        }
        else{
            return false;
        }
    }
}
