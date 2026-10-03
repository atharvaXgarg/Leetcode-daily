class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] arr1=new int[1001];
        for(int i=0;i<target.length;i++){
            arr1[target[i]]++;
            arr1[arr[i]]--;
        }
        for(int i=0;i<target.length;i++){
            if(arr1[target[i]]!=0 || arr1[arr[i]]!=0){
                return false;
            }
        }
        return true;
        
    }
}
