package LinkedList;

public class PairSum {
    public int pairSum(ListNode head) {
        if(head == null){
            return 0;
        }

        int res = -2147483648, curr = 0;
        ListNode fast = head, slow = head, mid;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        mid = slow;
        slow = reverseList(slow);
        mid.next = null;

        fast = head;
        while(slow != null){
            curr = fast.val + slow.val;
            fast = fast.next;
            slow = slow.next;
            if(curr > res){
                res = curr;
            }
        }

        return res;
    }

    private ListNode reverseList(ListNode node){
        ListNode newHead;
        if(node == null || node.next == null){
            return node;
        }

        newHead = reverseList(node.next);
        node.next.next = node;
        return newHead;
    }
}
