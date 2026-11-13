class Solution {
    public int minPartitions(String n) {
      
        int[]arr=new int[10];
        for(int i=0;i<n.length();i++){
            arr[(int)n.charAt(i)-48]++;
        }
        for(int i=9;i>=0;i--){
            if(arr[i]>0){
                return i;
            }
        }
        return 0;
    }
}
