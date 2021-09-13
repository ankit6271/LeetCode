class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuffer newStr=new StringBuffer("");
        char [] newChar=new char[indices.length];
        for(int i=0;i<indices.length;i++){
            newChar[indices[i]]=s.charAt(i);
        }
        for(char i:newChar){
            newStr.append(i);
        }
        return newStr.toString();
    }
}
