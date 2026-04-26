class Solution {
public:
    int furthestDistanceFromOrigin(string move) {
        int l=0, r=0,d=0;
        for(int i=0;i<move.size();i++){
            if(move[i]=='L'){
                l++;
            }
            else if(move[i]=='R'){
                r++;
            }
            else{
                d++;
            }
        }
        if(l>r){
            return l+d-r;
        }
        
            return r+d-l;
        
    }
};
