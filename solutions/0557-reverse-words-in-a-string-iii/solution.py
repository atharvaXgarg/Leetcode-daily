class Solution:
    def reverseWords(self, s: str) -> str:
        l=s.split()
        for x in range(len(l)):
            l[x]=l[x][::-1]
        return " ".join(l)    
        
        

        
