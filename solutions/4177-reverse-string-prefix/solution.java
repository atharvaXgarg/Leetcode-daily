class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb=new StringBuilder();
        if(s.length()==1 || k==1  ){
            return s;
        }
        sb.append(s.substring(0,k));
        sb.reverse();
        sb.append(s.substring(k,s.length()));
        return sb.toString();

    }
}
