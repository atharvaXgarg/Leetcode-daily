class Solution {
    public int commonFactors(int a, int b) {
        int count = 1;
        if(a==1 || b==1){
            return 1;
        }
        if (a > b) {
            if(a%b==0) count++;
            for (int i = 2; i < b / 2 + 1; i++) {
                if (a % i == 0 && b % i == 0) {
                    count += 1;
                }

            }
        } else {
            if(b%a==0) count++;
            for (int i = 2; i < a / 2 + 1; i++) {
                if (a % i == 0 && b % i == 0) {
                    count += 1;
                }
            }

        } return count;

    }
}
