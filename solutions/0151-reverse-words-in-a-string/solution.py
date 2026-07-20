class Solution:
    def reverseWords(self, s: str) -> str:
        li=s.split()
        li=li[::-1]
        return " ".join(li)
        
