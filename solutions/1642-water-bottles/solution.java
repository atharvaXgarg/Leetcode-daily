class Solution {
    public int numWaterBottles(int numBottle, int numExchange) {
        int drunk=numBottle; int remaining=0;
        while(numBottle>=numExchange){
              drunk+=numBottle/numExchange;
              remaining=numBottle%numExchange;
              numBottle=numBottle/numExchange+remaining;
              
        }
        return drunk;
    
    }
}
