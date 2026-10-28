class Solution {
    public int[] shortestToChar(String s, char c) {
        int []arr=new int[s.length()];
        Arrays.fill(arr,s.length());
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                arr[i]=0;
            }
        }
        for(int i=0;i<s.length();i++){
            if(arr[i]==0){
            for(int j=0;j<s.length();j++){
              arr[j]=Math.min(arr[j],Math.abs(i-j));
            }
            }
        }
        return arr;

         
    }
}