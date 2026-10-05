class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Character>st =new Stack<>();
          int []arr= new int[s.length()/2];
       
        int prev=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                st.push(ch);
            }
             else if(ch==')'){
                st.pop();
                if(st.size()>=prev){
                    prev=st.size();
                    arr[prev]++;
                }
                else{
                    arr[st.size()]+=2*arr[prev];
                    arr[prev]=0;
                    prev=st.size();
                }

             }
        }
        return arr[0];
    }
}
