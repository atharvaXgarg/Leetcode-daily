class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        ArrayList<Integer> al=new ArrayList<>(hs);
        Collections.sort(al);
        for(int i=0;i<arr.length;i++){
            int found=-1,left=0,right=al.size()-1;
            while(found==-1){
              int mid=(left+right)/2;
              if(al.get(mid)==arr[i]){
                found=mid+1;
              }
              else if(al.get(mid)>arr[i]){
                right=mid-1;
              }
              else{
                left=mid+1;
              }
            }
            arr[i]=found;
        }
        return arr;

    }
}
