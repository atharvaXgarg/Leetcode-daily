class Solution {
    public int reverseDegree(String s) {
        //1. a=26 (27-1) z=1 (27-26) for question 
        // 2. Ascii a=97 z=122
        // 3. reality a=1 (97-96) z=26 (122-96)
        // so finally we'd to 27-(ascii value-96)=123-ascii
        int k=0;
        for(int i=0;i<s.length();i++){
            k+=(123-(int)(s.charAt(i)))*(i+1);
        }
        return k;
    }
}
