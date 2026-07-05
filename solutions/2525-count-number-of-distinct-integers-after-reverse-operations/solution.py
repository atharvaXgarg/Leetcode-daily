class Solution(object):
    def countDistinctIntegers(self, nums):
        s=set()
        for x in nums:
            s.add(int(str(x)))
            s.add(int(str(x)[::-1]))
        return len(s)    


        """
        :type nums: List[int]
        :rtype: int
        """
        
