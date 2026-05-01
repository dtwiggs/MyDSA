# import necessary packages using command below, then choose the import
# ctrl .

from typing import List

class Solution:
    def baseball_scores(self, operations: List[str]) -> int:
        res = []

        for op in operations:    
            if op == '+':
                res.append(int(res[i - 2] + res[i - 1]))
            elif op == 'D':
                res.append(int(2 * res[i - 1]))
            elif op == 'C':
                res.pop
            else:
                res.append()

        print(res)
        sum = 0
        for num in res:
            sum += num

        return sum
        
# int, + add last 2, D double, C clear last