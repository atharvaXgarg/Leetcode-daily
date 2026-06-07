class Solution {
    public String truncateSentence(String s, int k) {
        String[] st=s.split(" ");
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<k;i++){
           sb.append(st[i]).append(" ");
        }
        return (sb.toString()).trim();
    }
}
