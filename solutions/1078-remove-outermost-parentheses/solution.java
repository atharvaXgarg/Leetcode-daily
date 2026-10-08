class Solution {
    public String removeOuterParentheses(String s) {
      int count=0;
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='('){
            if(count!=0){
                sb.append('(');
            }
            count++;
          }
          else{
            if(count!=1){
                sb.append(')');
            }
            count--;
          }
        }
      
      return sb.toString();
    }
}
