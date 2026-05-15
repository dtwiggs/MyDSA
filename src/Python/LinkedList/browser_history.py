class ListNode:
    def __init__(self, page: str, next = None, prev = None):
        self.page = page
        self.next = next
        self.prev = prev

class browserHistory:
    def __init__(self, homepage: str):
        home = ListNode(homepage)
        self.home = home
        self.curr = home

    def visit(self, url: str) -> None:
        tmp = ListNode(url)
        self.curr.next  = tmp
        tmp.prev = self.curr
        self.curr = tmp

    def back(self, steps: int) -> str:
        while self.curr.prev and steps > 0:
            self.curr = self.curr.prev
            steps -= 1
        return self.curr.page

    def forward(self, steps: int) -> str:
        while self.curr.next and steps > 0:
            self.curr = self.curr.next
            steps -= 1
        return self.curr.page