class Solution {
    public int findPermutationDifference(String s, String t) {
        int[]arr1=new int[26];
        int[]arr2=new int[26];
        // filling the indexes as Each character occurs at most once in s 
        // therefore every char associated with a unique index
        for(int i=0;i<s.length();i++){
            arr1[(int)s.charAt(i)-97]=i;
            arr2[(int)t.charAt(i)-97]=i;
        }
        int res=0;
        for(int i=0;i<s.length();i++){
             res+=(int)Math.abs(arr1[(int)s.charAt(i)-97]-arr2[(int)s.charAt(i)-97]);
        }
        return res;
    }
}
