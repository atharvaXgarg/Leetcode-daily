class Solution {
public:
    string maximumOddBinaryNumber(string s) {
        int count=0;
        for(int i=0;i<s.size();i++){
        if(s[i]=='1'){
             count+=1;
        }
        }
        string s1="";
        s1= s1+"1";
        for(int i=0;i<s.size()-count;i++){
            s1="0"+s1;
        }
        for(int i=0;i<count-1;i++){
            s1="1"+s1;
        }
return s1;
    }
};
