class Solution:
    def detectCapitalUse(self, s: str) -> bool:
        if(s.isupper() or s.islower()):
            return True
        elif (s[0].isupper):
            s=s[1:]
            for x in s:
                if(x.isupper()):
                    return False
            return True
        else :
            return False                
        
