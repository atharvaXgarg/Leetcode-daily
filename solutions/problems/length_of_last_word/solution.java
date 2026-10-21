class Solution {
    public int lengthOfLastWord(String s) {
        int count=0,prev=0;
        String[] arr=s.split(" ");
        return arr[arr.length-1].length();
    }
}