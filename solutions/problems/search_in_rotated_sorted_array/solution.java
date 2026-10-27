class Solution {
    // Finds the index of the smallest element (pivot point)
    private int findPivot(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            // If mid element > end element, smallest element lies in right half
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else { // Smallest element is at mid or in left half
                end = mid;
            }
        }
        return start; // start == end, index of minimum element
    }

    private int binarySearch(int start, int end, int target, int[] nums) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) return -1;

        int pivot = findPivot(nums);

        // Decide which side to perform binary search on
        if (target >= nums[pivot] && target <= nums[n - 1]) {
            return binarySearch(pivot, n - 1, target, nums);
        } else {
            return binarySearch(0, pivot - 1, target, nums);
        }
    }
}