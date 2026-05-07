class ListNode:
    def __init__(self, val = 0, next = None):
        self.val = val
        self.next = next

class reverseList:
    def reverse_list(self, head: ListNode | None) -> ListNode | None:
        if not head or not head.next:
            return head
        return self.reverse_list_rec(head)

    def reverse_list_rec(self, node: ListNode) -> ListNode:
        if not node.next:
            return node
        
        newHead = self.reverse_list_rec(node.next)
        node.next.next = node
        node.next = None

        return newHead