class Solution:
    def reverseOnlyLetters(self, s: str) -> str:
        l=[]
        for x in s:
            if x.isalpha():
                l.append(x)
        l=l[::-1]        
        j=[];k=0
        for x in s:
            if x.isalpha():
                j.append(l[k])
                k+=1
            else:
                j.append(x)          
        return "".join(j)
    
