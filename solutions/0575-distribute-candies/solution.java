class Solution {
    public int distributeCandies(int[] ca) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<ca.length;i++){
            hs.add(ca[i]);
        }
        return Math.min(ca.length/2, hs.size());
    }
}
