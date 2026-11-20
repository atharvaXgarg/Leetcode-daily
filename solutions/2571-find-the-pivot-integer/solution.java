class Solution {
    public int pivotInteger(int n) {
        int left = 1, right = n;
        int lsum = 1, rsum = n;
        while (left < right) {
            if (lsum < rsum) {
                left++;
                lsum += left;
            } else {
                right--;
                rsum += right;
            }
        }

        return (lsum == rsum) ? left : -1;
    }
}
