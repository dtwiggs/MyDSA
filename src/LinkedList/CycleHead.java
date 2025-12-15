package LinkedList;

public class CycleHead {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return head;
        ListNode fast = head, slow = head, newHead = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                while(newHead != slow){
                    newHead = newHead.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        
        return null;
    }
}
