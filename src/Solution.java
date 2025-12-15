/*
git reset --hard
git clean -fd
git pull
*/
import java.util.*;

import LinkedList.ListNode;
@SuppressWarnings("unused")

class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return head;
        ListNode fast = head, slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) return slow;;
        }

        return fast;
    }
}