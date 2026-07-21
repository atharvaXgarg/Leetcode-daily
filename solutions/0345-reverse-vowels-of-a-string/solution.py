class Solution(object):
    def reverseVowels(self, s):
        li=[]
        for x in s:
            if x.lower() in 'aeiou':
                li.append(x)
        li=li[::-1]
        j=[];i=0
        for x in s:
            if x.lower() in 'aeiou':
                 j.append(li[i])
                 i+=1
            else:
                j.append(x)
        return "".join(j)            


        
