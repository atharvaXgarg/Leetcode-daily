class Solution {
    public String interpret(String nums) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<nums.length();i++){
            if(nums.charAt(i)=='G'){
                sb.append("G");
            }
            else if(nums.charAt(i)=='('){
                if(nums.charAt(i+1)=='a'){
                    sb.append("al");
                }
                else{
                    sb.append("o");
                }
            }
        }
        return sb.toString();
    }
}