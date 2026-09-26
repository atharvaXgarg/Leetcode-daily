class Solution {
    public char findTheDifference(String s, String t) {
       char[]ch=new char[26];
       for(char b:t.toCharArray()){
        ch[(int)b-97]++;
       }
       for(char b:s.toCharArray()){
        ch[(int)b-97]--;
       }
       for(int i=0;i<26;i++){
        if(ch[i]==0){
          continue;
        }
        return (char)(i+97);
       }
        return 'a';
       
        
    }
}
