class Solution {
    public String sortSentence(String s) {
        String[] words=s.split(" ");
        String [] s1=new String[words.length];
        for(String word: words){
            s1[(int)word.charAt(word.length()-1)-49]=word.substring(0,word.length()-1);// 49 ascii==1
        }
        s=String.join(" ",s1);
        return s;
    }
}
