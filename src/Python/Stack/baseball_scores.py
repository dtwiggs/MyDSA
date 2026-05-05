from typing import List

class baseballScores:
    def baseball_scores(self, operations: List[str]) -> int:
        res = []
        score = 0
        curr = 0

        for op in operations:
            curr = res.peek  
            if op == '+':
                res.pop
                prev = res.peek
                res.append(curr)
                res.append(int(curr + prev))
            elif op == 'D':
                res.append(int(2 * curr))
            elif op == 'C':
                res.pop
            else:
                res.append(int(op))

        while res:
            score += int(res.pop)
        return score