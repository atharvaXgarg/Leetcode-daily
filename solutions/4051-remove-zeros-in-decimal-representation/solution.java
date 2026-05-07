class Solution {
    public long removeZeros(long n) {
        ArrayList<Long>li=new ArrayList<>();
        while(n!=0){
            if(n%10!=0) {
            li.add(n%10);}
            n/=10;
        }
        long sum=0;
        for(int i=li.size()-1;i>=0;i--){
          sum=sum*10+li.get(i);
        }
        return sum;
    }
}
