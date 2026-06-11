from typing import List

class MergeLists:
    def merge(self, nums1: List[int], nums2: List[int]) -> None:
        n1, n2 = len(nums1), len(nums2)
        r1, r2 = n1 - n2 - 1, n2 - 1
        n1 -= 1
        
        while r1 >= 0 and r2 >= 0:
            if nums1[r1] >= nums2[r2]:
                nums1[n1] = nums1[r1]
                n1 -= 1
                r1 -= 1
            else:
                nums1[n1] = nums2[r2]
                n1 -= 1
                r2 -= 1
        
        while r1 >= 0 and n1 >= 0:
            nums1[n1] = nums1[r1]
            n1 -= 1
            r1 -= 1
        while r2 >= 0 and n1 >= 0:
            nums1[n1] = nums2[r2]
            n1 -= 1
            r2 -= 1