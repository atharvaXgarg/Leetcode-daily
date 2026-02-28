class Solution {
    public int trailingZeroes(int n) {
        int count=0;
            for(int i=5; i<=n ;i+=5){
               count++;
               int j=i/5;
               while(j%5==0){ count++; j/=5;}
            
            }  return count;
            }
        }
























    //     long fact=1,count=0;
    //     for(int i=2; i<=n; i++){
    //         fact*=i; i=4 25 =
    //     }
    //         while(fact%10==0){
    //             count++;
    //             fact/=10;
    //         }
    //         return (int)count;
        // 5 5!=120 5*2=10 15* 12=180
        
    //  not work for greater values calculating factors is not possible
    // int count=0;
    // for(int i=5; i<=n; i=i+5){
    //    count++;
    // } return count;
    

