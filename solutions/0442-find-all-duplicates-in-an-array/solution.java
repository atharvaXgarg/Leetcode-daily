class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int hash[] = new int [nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            hash[nums[i]]++;
        }

        List<Integer>al = new ArrayList<>();
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == 2) {
                al.add(i);
            }
        }
        return al;
    }
}
