/*
git reset --hard
git clean -fd
git pull
*/
import java.util.*;
@SuppressWarnings("unused")

class Solution {
    public int pairSum(ListNode head) {
        int res = 0;
        ListNode fast = head, slow = head;

        while(fast != null || fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = slow;
        while(slow != null){
            slow = slow.next;
            prev.next = 
            prev = slow;
        }

        return res;
    }
}