from typing import List

class arrayConcatentaion:
    def array_concatenation(self, nums: List[int]) -> List[int]:
        n = len(nums)
        ans = [0] * (2 * n)
        i = 0
        for num in nums:
            ans[i] = num
            ans[i + n] = num
            i += 1
        return ans