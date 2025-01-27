package LinkedList;
class MergeTwoSortedLinkedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        } else if(list2 == null){
            return list1;
        }

        ListNode head = null;
        ListNode curr = null;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                if(head == null){
                    curr = list1;
                    head = curr;
                    list1 = list1.next;
                } else{
                    curr.next = list1;
                    list1 = list1.next;
                    curr = curr.next;
                }
            } else{
                if(head == null){
                    curr = list2;
                    head = curr;
                    list2 = list2.next;
                } else{
                    curr.next = list2;
                    list2 = list2.next;
                    curr = curr.next;
                }
            }
        }

        if(list1 != null){
            curr = list1;
        } else{
            curr = list2;
        }

        return head;
    }
}