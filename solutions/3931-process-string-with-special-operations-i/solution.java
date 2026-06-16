class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int a= s.charAt(i);
            if(a>=97 && a<=122){
                sb.append((char)a);
            }
            else if((char)a=='*' && sb.length()!=0){
              sb.deleteCharAt(sb.length()-1);
            }
            else if((char)a=='#'){
                sb.append(sb.toString());
            }
            else{
                sb.reverse();
            }
        }
        return sb.toString();
    }
}
