class Solution {
    public int canBeTypedWords(String text, String broken) {
        // convert broken array letters in array
        int[]arr=new int[26];int count=0;
        for(char ch:broken.toCharArray()){
            arr[ch-'a']++;
        }
        // convert string to words array by split along " "
        String[] st=text.split(" ");
        for(String word:st){
            boolean b=true;
            for(int i=0;i<word.length();i++){
                if(arr[word.charAt(i)-'a']!=0){
                    b=false; break;
                }
            }
            if(b) count++;
        }
        return count;



    }
}
