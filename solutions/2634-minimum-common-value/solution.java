class Solution {
    public int getCommon(int[] num1, int[] num2) {
        int res=-1;
        int i=0,j=0;
        while(i!=num1.length && j!=num2.length){
            if(num1[i]==num2[j]){
                res=num1[i];
                break;
            }
            else if(num1[i]>num2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        return res;
       
    }
}
