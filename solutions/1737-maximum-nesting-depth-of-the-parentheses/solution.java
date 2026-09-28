class Solution {
    public int maxDepth(String s) {
        int max=0;  int var=0;
        char [] ch=s.toCharArray();
        for(char x:ch){
            if(x=='('){
               var++;
            }
            else if(x==')'){
                var--;
            }
            if(var>max){
                max=var;
            }
        }
        return max;
    }
}
