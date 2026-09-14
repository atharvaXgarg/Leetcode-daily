class Solution {
    public int numOfStrings(String[] j, String word) {
        int k=0;
        for(int i=0;i<j.length;i++){
            if(word.indexOf(j[i])!=-1){
              k+=1;
            }
        }
        return k;
    }

}
