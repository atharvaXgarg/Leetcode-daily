class Solution {
    public char repeatedCharacter(String s) {
        int []k= new int[26];
        for(int i=0;i<s.length();i++){
            k[(int)s.charAt(i)-97]++;
              if( k[(int)s.charAt(i)-97]==2){
                return s.charAt(i);
        }
        }
        return 's';
    }
}
