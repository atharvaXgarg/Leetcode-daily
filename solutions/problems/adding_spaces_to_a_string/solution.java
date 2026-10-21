class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuffer sb=new StringBuffer();
        int k=0,i=0;
        for(i=0;i<s.length();i++){
            if(k==spaces.length){break;}
            else if(spaces[k]!=i){
                sb.append(s.charAt(i));
            }
            else{
                sb.append(" ");
                sb.append(s.charAt(i));
                k++;
            }
        }
        sb.append(s.substring(i,s.length()));
        return sb.toString();

    }
}