class Solution {
    public String trafficSignal(int timer) {
        if(30<timer && timer<=90) return "Red";
        else if(timer==30) return "Orange";
        else if(timer==0) return "Green";
        return "Invalid";
    }
}
