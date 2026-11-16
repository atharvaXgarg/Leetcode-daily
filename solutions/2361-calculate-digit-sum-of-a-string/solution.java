class Solution {
    int Sum(String s1) {
      
        int sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            sum += s1.charAt(i)-'0' ;
            
        }
        return sum;
    }

    public String digitSum(String s, int k) {
        // split into k parts , find sum of digits of individual part,concat the results, repeat while 
        // size of string is greater than k
        String res=s;
        while(res.length()>k){
            // make the substring and calculate sum and concatenate
            StringBuilder sb=new StringBuilder();
            int i=0;
            for( i=0;(i+k)<res.length();i+=k){
                sb.append(Sum(res.substring(i,i+k)));
            
            }
            
            sb.append(Sum(res.substring(i,res.length())));
            res=sb.toString();
            System.out.println(res);  
        }
        return res;
        
    }
}
