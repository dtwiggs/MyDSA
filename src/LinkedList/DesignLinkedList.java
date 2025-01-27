package LinkedList;
class DesignLinkedList {

    ListNode head;
    ListNode tail;
    ListNode tmp;
    int size;

    public DesignLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int index) {
        if (index >= size){
            return -1;
        } else if(index == 0){
            return head.val;
        } else if (index == size - 1){
            return tail.val;
        } else if(index < size/2){
            tmp = head;
            for(int i = 0; i < index; i++){
                tmp = tmp.next;
            }
            return tmp.val;
        } else if(index >= size/2){ 
            tmp = tail;
            for(int i = 1; i < size - index; i++){
                tmp = tmp.prev;
            }
            return tmp.val;
        } else {
            return -1;
        }
    }
    
    public void addAtHead(int val) {
        tmp = new ListNode(val);
        if(head == null && tail == null){
            head = tmp;
            tail = head;
            size++;
        } else {
            head.prev = tmp;
            head.prev.next = head;
            head = head.prev;
            size++;
        }
    }
    
    public void addAtTail(int val) {
        tmp = new ListNode(val);
        if(head == null && tail == null){
            head = tmp;
            tail = head;
            size++;
        } else {
            tail.next = tmp;
            tail.next.prev = tail;
            tail = tail.next;
            size++;
        }
    }

    public void addAtIndex(int index, int val) {

        if(index > size){
        } else if(index == 0){
            if(head == null && tail == null){
                tmp = new ListNode(val);
                head = tmp;
                tail = head;
                size++;
            } else {
                tmp = new ListNode(val);
                head.prev = tmp;
                head.prev.next = head;
                head = head.prev;
                size++;
            }
        } else if (index == size){
            tmp = new ListNode(val);
            tail.next = tmp;
            tail.next.prev = tail;
            tail = tail.next;
            size++;
        } else if(index < size/2){
            tmp = head;
            for(int i = 1; i < index; i++){
                tmp = tmp.next;
            }
            tmp.next.prev = new ListNode(val);
            tmp.next.prev.next = tmp.next;
            tmp.next = tmp.next.prev;
            tmp.next.prev = tmp;
            size++;
        } else if(index >= size/2){ 
            tmp = tail;
            for(int i = 1; i <= size - index; i++){
                tmp = tmp.prev;
            }
            tmp.next.prev = new ListNode(val);
            tmp.next.prev.next = tmp.next;
            tmp.next = tmp.next.prev;
            tmp.next.prev = tmp;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index >= size){
        } else if(index == 0){
            if(head.next == null){
                head = null;
                tail = null;
                size--;
            } else{
                head = head.next;
                head.prev = null;
                size--;
            }
        } else if (index == size - 1){
            tail = tail.prev;
            tail.next = null;
            size--;
        } else if(index < size/2){
            tmp = head;
            for(int i = 1; i < index; i++){
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
            tmp.next.prev = tmp;
            size--;
        } else if(index >= size/2){ 
            tmp = tail;
            for(int i = 1; i <= size - index; i++){
                tmp = tmp.prev;
            }
            tmp.next = tmp.next.next;
            tmp.next.prev = tmp;
            size--;
        }
    }

    private class ListNode {
        int val;
        ListNode next;
        ListNode prev;
        ListNode(int val) { this.val = val; }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:]
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */