class Solution {
    public String mapWordWeights(String[] words, int[] we) {
        HashMap<Integer,Character>hm=new HashMap<>();
        for(int i=0;i<26;i++){
            hm.put(25-i,(char)('a'+i));
        }
        StringBuffer sb=new StringBuffer();
        int index=0; 
         for(int i=0;i<words.length;i++){
            int sum=0;
            for(int j=0;j<words[i].length();j++ ){
                sum+=(we[words[i].charAt(j)-97]);
            }
            sb.append(hm.get(sum%26));
         }
        return sb.toString();

    }
}
