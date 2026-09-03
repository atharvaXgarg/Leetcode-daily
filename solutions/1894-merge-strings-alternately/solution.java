class Solution {
    public String mergeAlternately(String word1, String word2) {
        // time complexity == smaller wordlength
        // sabse pahle dekho chota word
       int w1=word1.length();
       int w2=word2.length();
       StringBuffer sb=new StringBuffer();
         int a=0;
       while(w1!=0 && w2!=0){
         sb.append(word1.charAt(a));
         sb.append(word2.charAt(a));
         a++; w1--; w2--;
       }
       if(w1!=0){
        sb.append(word1.substring(a));
       }
       else if(w2!=0){
        sb.append(word2.substring(a));
       }
       return sb.toString();      
    }
}
