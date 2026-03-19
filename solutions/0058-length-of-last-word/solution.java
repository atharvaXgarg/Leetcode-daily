class Solution {
    public int lengthOfLastWord(String s) {
        int count=0,prev=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)==' '){
                if(count>0){
                    prev=count;
                }
            count=0; 
            }
            else count++;
        }
        if(count==0) return prev;
        return count;
    }
}
