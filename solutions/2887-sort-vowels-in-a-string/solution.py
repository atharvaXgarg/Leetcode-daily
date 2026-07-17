class Solution:
    def sortVowels(self, s: str) -> str:
        l=[]
        for k in s:
            if k.lower() in "aeiou":
                l.append(k)
        l.sort()        
        j=[]; p=0
        for k in s:
            if k.lower() in "aeiou":
                j.append(l[p])
                p+=1
            else:
                j.append(k)
        return "".join(j)           

           

        
