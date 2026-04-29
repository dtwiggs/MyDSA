# git reset --hard
# git clean -fd
# git pull

# import necessary packages using command below, then choose the import
# ctrl .
from typing import List

class Solution:
    def replace_elements(self, arr: List[int]) -> List[int]:
        res = arr
        max_num = arr[len(arr) - 1]
        j = 0
        for i in range(len(arr) - 1, -1, -1):
            res[j] = max(arr[i], max_num)
            j += 1

        res[0] = -1
        return reversed(res)
        

if __name__ == "__main__":
    sol = Solution()
    # print(sol.)

# example print: print(sol.twoSum([2, 7, 11, 15], 9))