class Solution {
    int getLen(int j) {
        int count = 0;
        while (j != 0) {
            j /= 10;
            count++;
        }
        return count;
    }

    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for (int i = low; i <= high; i++) {
            int len = getLen(i);
            if ((len & 1) != 0) {
                continue;
            } else {
                int sl=0,sr=0;
                int temp=i;
                for (int j = 0; j < len / 2; j++) {
                    sr += temp % 10;
                    temp /= 10;
                }
                for (int j = len / 2; j < len; j++) {
                    sl += temp % 10;
                    temp /= 10;
                }
                if(sl==sr){
                  count++;
                }
            }
        }
        return count;
        
    }
}
