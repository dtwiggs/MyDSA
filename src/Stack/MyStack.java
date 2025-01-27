package Stack;
public class MyStack {
    ListNode top;
    ListNode tmp;
    int val;

    public MyStack() {
        top = null;
        tmp = null;
    }
    
    public void push(int x) {
        tmp = new ListNode(x);
        if(top == null){
            top = tmp;
        } else {
            tmp.next = top;
            top = tmp;
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

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */