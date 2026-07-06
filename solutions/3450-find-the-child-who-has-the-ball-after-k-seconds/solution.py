class Solution(object):
    def numberOfChild(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: int
        """
        r=0; d=1
        for x in range(k):
            r+=d
            if r==0:
                d=1
            elif r==n-1:
                d=-1  
        return r          
            
        
