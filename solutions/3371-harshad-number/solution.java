class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        if(x>=1 && x<=9) return x;
        else { int sum=0,k=x;
            for(int i=0; i<3; i++){
                sum+=x%10;
                x/=10;
            }
            if(k%sum==0)return sum;
            else return -1;
        }
    }
}
