class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        li=nums1+nums2
        li.sort()
        if len(li)%2==0:
            return (li[len(li)//2]+li[(len(li)-1)//2])/2
        return li[len(li)//2]                              

        
