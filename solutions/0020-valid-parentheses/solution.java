class Solution {
    public boolean isValid(String s) {
       if(s.length()%2!=0){
        return false;
       }
       else{
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char p=s.charAt(i);
            if(p=='[' || p=='{' || p=='('){
                stack.push(p);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if (p==']'){
                    if(stack.peek()=='['){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
                     if (p=='}'){
                    if(stack.peek()=='{'){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                     }
                     if (p==')'){
                    if(stack.peek()=='('){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
    }
}
