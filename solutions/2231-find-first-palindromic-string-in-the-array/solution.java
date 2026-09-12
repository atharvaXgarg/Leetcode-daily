class Solution {
    boolean ispl(String s){
        int left=0, right=s.length()-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            right--; left++;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        String str="";
        for(int i=0;i<words.length;i++){
            if(ispl(words[i])){
                return words[i];
            }
        }
        return str;
    }
}
