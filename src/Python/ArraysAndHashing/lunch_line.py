from typing import List


class lunchLine:
    def lunch_line(self, students: List[int], sandwiches: List[int]) -> int:
        count = {0:0, 1:0}
        for student in students:
            count[student] += 1

        for sandwich in sandwiches:
            if count.get(sandwich) > 0:
                count[sandwich] -= 1
            else:
                break

        res = count[0] + count[1]
        return res