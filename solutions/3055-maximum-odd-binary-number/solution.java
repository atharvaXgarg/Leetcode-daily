class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
             count+=1;
        }
        }
        String s1="";
        s1= s1+"1";
        for(int i=0;i<s.length()-count;i++){
            s1="0"+s1;
        }
        for(int i=0;i<count-1;i++){
            s1="1"+s1;
        }
return s1;
        }
    }

