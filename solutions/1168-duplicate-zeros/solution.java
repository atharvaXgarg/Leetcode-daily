class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){li.add(0);}
            li.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=li.get(i);
        }
        
    }
}
