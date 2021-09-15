1)
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String wordS1="";
        String wordS2="";
        for(String s:word1){
            wordS1+=s;
        }
        for(String s:word2){
            wordS2+=s;
        }
        if(wordS1.equals(wordS2)){
            return true;
        }
        return false;
    }
}

2)
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder wordS1=new StringBuilder("");
        StringBuilder wordS2=new StringBuilder("");
        for(String s:word1){
            wordS1.append(s);
        }
        for(String s:word2){
            wordS2.append(s);
        }
        if(wordS1.toString().equals(wordS2.toString())){
            return true;
        }
        return false;
    }
}
