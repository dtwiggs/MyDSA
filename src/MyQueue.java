public class MyQueue {
    ListNode top;
    ListNode tail;
    int val;

    public MyQueue() {
        top = null;
        tail = null;
    }
    
    public void append(int x) {
        ListNode tmp = new ListNode(x);
        if(top == null){
            top = tmp;
        } else {
            tail.next = tmp;
            tail = tail.next;
        }
    }
    
    public int pop() {
        val = top.val;
        top = top.next;
        return val;
    }
    
    public int top() {
        return top.val;
    }
    
    public boolean empty() {
        if(top == null){
            return true;
        } else {
            return false;
        }
    }

    private class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
}