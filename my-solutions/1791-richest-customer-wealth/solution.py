class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        richest=0
        for acc in accounts:
            wealth=sum(acc)
            richest=max(richest,wealth)
        return richest
        
