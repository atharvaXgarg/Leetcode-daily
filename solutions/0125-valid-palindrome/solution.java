class Solution {
    public boolean isPalindrome(String s) {
        String k=""; String res="";
        for(int i=0; i<s.length();i++){
            char ch= s.charAt(i);
            if((ch>=65 && ch<=90)|| (ch>=97&& ch<=122) || (ch>=48&& ch<=57)){
                res=res+ch;
                k=ch+k;

            }
        }
       
        return  k.equalsIgnoreCase(res);
}
}
