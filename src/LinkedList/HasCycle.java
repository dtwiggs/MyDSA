package LinkedList;

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode fast = head, slow = new ListNode(-1, head);

        slow = slow.next;
        fast = fast.next.next;
        while(slow != fast && fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast == null || fast.next == null){
            return false;
        }

        return true;
    }
}
