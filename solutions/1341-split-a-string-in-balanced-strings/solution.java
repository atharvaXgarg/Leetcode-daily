class Solution {
    public int balancedStringSplit(String s) {
        int cr=0,cl=0,bal=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                cl+=1;
            }
            else{cr+=1;}
            if(cl==cr){
                bal++;
            }

        }
        return bal;
    }
}
