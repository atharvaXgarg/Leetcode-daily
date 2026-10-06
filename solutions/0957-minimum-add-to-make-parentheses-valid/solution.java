class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Boolean> s1=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                s1.push(true);
            }
            else if(s1.empty() || s1.peek()!=true ){
                s1.push(false);
            }
            else s1.pop();
        }
        return s1.size();
    }
}
