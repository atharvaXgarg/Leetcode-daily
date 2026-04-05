class Solution:
    def judgeCircle(self, moves: str) -> bool:
        if(moves.count("L")==moves.count("R") and moves.count("U")==moves.count("D")):
            return True
        return False    
        
