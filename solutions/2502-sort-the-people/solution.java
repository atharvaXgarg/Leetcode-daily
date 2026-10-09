class Solution {
    public String[] sortPeople(String[] n, int[] arr) {
     HashMap<Integer,String> hm=new HashMap<>();
     for(int i=0;i<arr.length;i++){
        hm.put(arr[i],n[i]);
     }
     Arrays.sort(arr);
     for(int i=0;i<arr.length;i++){
        n[i]=hm.get(arr[i]);
     }
     for(int i=0;i<arr.length/2;i++){
        String swap=n[i];
        n[i]=n[arr.length-i-1];
        n[arr.length-i-1]=swap;
     }
     return n;
    }
}
