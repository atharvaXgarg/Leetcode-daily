class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        int max = 0, min = 100;
        int[] arr = new int[100];
        // find min and max element and fill counter array
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i] - 1] = 1;
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        for (int i = min; i < max; i++) {
            if (arr[i - 1] == 0) {
                al.add(i);
            }
        }
        return al;
    }
}
