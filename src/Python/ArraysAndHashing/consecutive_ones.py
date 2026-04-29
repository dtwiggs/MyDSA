from typing import List

class consecutiveOnes:
    def max_consecutive_ones(self, nums: List[int]) -> int:
        res = curr = 0
        for num in nums:
            if num == 0:
                res = max(res, curr)
                curr = 0
            else:
                curr += 1
        return max(res, curr)