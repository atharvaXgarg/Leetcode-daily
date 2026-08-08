class Solution {
    public int maxFreqSum(String s) {
        // a->1 e -> 5 i-9 o-> 15 u->21
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[(int)s.charAt(i)-97]++;
        }
        int maxVow=0,MaxConst=0;
        for(int i=0;i<26;i++){
            switch(i){
                case 0,4,8,14,20-> maxVow=Math.max(arr[i],maxVow);
                default -> MaxConst=Math.max(arr[i],MaxConst);
            }
        }
        return (int)(maxVow+MaxConst);

    }
}
