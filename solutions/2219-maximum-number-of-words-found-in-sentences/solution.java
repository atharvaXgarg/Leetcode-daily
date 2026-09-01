class Solution {
    public int mostWordsFound(String[] s) {
        int maxi=0;
        for(int i=0;i<s.length;i++){
            String[] str=s[i].split(" ");
            maxi=Math.max(maxi,str.length);
        }
        return maxi;
    }
}
