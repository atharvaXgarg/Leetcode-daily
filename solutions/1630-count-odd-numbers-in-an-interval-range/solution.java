class Solution {
    public int countOdds(int low, int high) { 
      if((low&1)==0)  low+=1;
      if((high&1)==0) high-=1;
      return (high-low)/2 +1;

      
    }
}
