class Solution {
    public int[] decode(int[] en, int first) {
        int arr[]=new int[en.length+1];
        arr[0]=first;
        for(int i=0;i<en.length;i++){
            arr[i+1]=first^en[i];
            first=arr[i+1];
        }
        return arr;
    }
}
