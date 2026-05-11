# import necessary packages using command below, then choose the import
# ctrl .

from typing import List, Optional

class ListNode:
    def __init__(self, page: str, next = None, prev = None):
        self.page = page
        self.next = next
        self.prev = prev

class Solution:
    home, curr = None, None
    def __init__(self, homepage: str):
        self.homepage = homepage
        home = ListNode(homepage)
        curr = home

    def visit(self, url: str) -> None:
        curr.next = ListNode(url)
        curr.next.prev = curr
        curr = curr.next

    def back(self, steps: int) -> str:
        while curr.prev and steps > 0:
            curr = curr.prev
            steps -= 1
        return curr.page

    def forward(self, steps: int) -> str:
        while curr.next and steps > 0:
            curr = curr.next
            steps -= 1
        return curr.page