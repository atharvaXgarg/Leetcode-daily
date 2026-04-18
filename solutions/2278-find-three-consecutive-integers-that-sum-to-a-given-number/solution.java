class Solution {
    public long[] sumOfThree(long num) {
        /* 3 consecutive let us say x-1, x , x+1 so 3x=number that is num%3==0 we will 
         return array else return empty array
         */
        if (num % 3 != 0) {
            return new long[0];
        } else {
            long k = num / 3;
            long[] arr = new long[3];
            arr[0] = k - 1;
            arr[1] = k;
            arr[2] = k + 1;
            return arr;
        }

    }
}
