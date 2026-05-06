# import necessary packages using command below, then choose the import
# ctrl .

from typing import List, Optional

class ListNode:
    def __init__(self, val = 0, next = None):
        self.val = val
        self.next = next

class Solution:
    def reverse_list(self, head: ListNode | None) -> ListNode | None:
        if head:
            self.reverse_list_rec(head)
        return head

    def reverse_list_rec(self, node: ListNode) -> ListNode:

        return node