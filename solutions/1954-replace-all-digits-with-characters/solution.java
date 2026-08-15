class Solution {
    public String replaceDigits(String s) {
        char[] ch=s.toCharArray();
        for(int i=1;i<ch.length;i+=2){
            ch[i]=(char)((int)ch[i-1]+(int)ch[i]-48);
        }
        s=new String(ch);
        return s;
    }
}
