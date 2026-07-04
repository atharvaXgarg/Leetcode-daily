class Solution(object):
    def thirdMax(self, nums):
        nums=list(set(nums))
        if len(nums)<3:
            return max(nums)
        else:
            nums.sort() 
            return nums[-3]   
        """
        :type nums: List[int]
        :rtype: int
        """
        
