class Solution {
    public boolean checkString(String s) {
        // difference is 0 or 1 if it becomes -ve break
        for(int i=1;i<s.length();i++){
            int j=s.charAt(i)-s.charAt(i-1);
            if(j<0){
                return false;
            }
        }
        return true;
    }
}
