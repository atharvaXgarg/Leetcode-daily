class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        count = Counter(stones)
        nums = 0
        for char in jewels:
            nums += count[char]
        return nums

        
