class Solution {
    public List<Integer> stableMountains(int[] height, int hold) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<height.length;i++){
            if(height[i-1]>hold){
                al.add(i);
            }
        }
        return al;
    }
}