class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        //case 1 if numsOnes+numsZeros>=k
        if((numOnes+numZeros)>=k){
            if(k>numOnes)return numOnes;
             else return k;
        }
        else{
          return numOnes -(k-numOnes-numZeros);
        }
    }
}
