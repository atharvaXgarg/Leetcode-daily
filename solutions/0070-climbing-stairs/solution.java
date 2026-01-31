class Solution {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        int a = 1, b = 1;
        int fib = 0;
        for (int i = 1; i < n; i++) {
            fib = a + b;
            b = a;
            a = fib;

        }
        return fib;
    }
}
