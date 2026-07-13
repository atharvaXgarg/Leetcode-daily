class Solution:
    def capitalizeTitle(self, title: str) -> str:
        k = title.split()
        
        for i in range(len(k)):
            if len(k[i]) <= 2:
                k[i] = k[i].lower()
            else:
                k[i] = k[i][0].upper() + k[i][1:].lower()
                
        res = " ".join(k)
        return res
