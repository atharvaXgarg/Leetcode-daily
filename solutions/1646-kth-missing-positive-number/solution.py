class Solution(object):
    def findKthPositive(self, arr, k):
        b=[];i=1
        while(len(b)!=k):
            if i not in arr:
                b.append(i)
            i+=1
        return b[len(b)-1]        

        """
        :type arr: List[int]
        :type k: int
        :rtype: int
        """
        
