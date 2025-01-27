package LinkedList;
public class BrowserHistory {
    ListNode head;
    ListNode current;
    ListNode previous;

    public BrowserHistory(String homepage){
        head = new ListNode(homepage);
        current = head;
    }

    public void visit(String url){
        current.next = new ListNode(url);
        previous = current;
        current = current.next;
        current.prev = previous;
    }

    public String back(int steps){
        for(int i = 0; i < steps; i++){
            if (current.prev != null){
                current = current.prev;
            }
        }
        return current.url;
    }

    public String forward(int steps){
        for(int i = 0; i < steps; i++){
            if (current.next != null){
                current = current.next;
            }
        }
        return current.url;
    }

    private class ListNode {
        String url;
        ListNode next;
        ListNode prev;
    
        ListNode(String url){
            this.url = url;
            this.next = null;
            this.prev = null;
        }
    }
}

