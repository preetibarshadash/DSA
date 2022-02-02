class Solution:
    def mySqrt(self, x: int) -> int:
        if (x == 0):
            return 0
        if (x == 1):
            return 1
        low = 1
        high = x
        while(low <= high):  
            mid = (low + high)//2
            
            if(mid == (x/mid)):
                return mid
            elif(mid <= (x/mid)):
                low = mid + 1
            else:
                high = mid - 1
        return high
        
