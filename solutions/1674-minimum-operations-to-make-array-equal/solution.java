class Solution {
    public int minOperations(int n) {

        // reduce to median of array 

        //    int out=0;
        //    for(int i=0;i<n/2;i++){
        //        out+=(n-((2*i)+1));
        //    }
        //    return out;
        //by observation 
       if(n%2==0){
        // matlab difference odd hoga aur end 1 pai hoga
        // largest differ== n-1
        // sum of odd from 1 to n-1 odd terms 
        return ((n/2)*((n/2)));
       }else{
        // diff == even sum of even from 2 to n-1 2,4,6,8...==> for 3 n==1 which (3-1)/2 now sum==n/2)(a+l)
        return ((n-1)/2)*((n+1)/2);
       }

    }
}
