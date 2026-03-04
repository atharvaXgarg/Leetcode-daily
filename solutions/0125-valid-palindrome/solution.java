class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder res=new StringBuilder("");
        for(int i=0; i<s.length();i++){
            char ch= s.charAt(i);
            if((ch>=65 && ch<=90)|| (ch>=97&& ch<=122) || (ch>=48&& ch<=57)){
               if(ch>=65 && ch<=90){
                ch+=32;
               }
                res.append(ch);
            }
        }
       int left=0; int right= res.length()-1;
    //    System.out.print(res);
        while(left<=right){
           if(res.charAt(left)!=res.charAt(right)){return false;}
           left++; right--;
        }
        return true;
}
}
