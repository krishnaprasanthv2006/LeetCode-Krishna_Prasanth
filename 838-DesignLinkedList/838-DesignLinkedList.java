// Last updated: 11/08/2026, 14:16:21
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {

    Node head;

    public MyLinkedList() {
        head = null;
    }

    public int get(int index) {

        if(index < 0)
            return -1;

        Node curr = head;

        for(int i = 0; i < index; i++) {
            if(curr == null)
                return -1;

            curr = curr.next;
        }

        if(curr == null)
            return -1;

        return curr.val;
    }

    public void addAtHead(int val) {

        Node nn = new Node(val);

        nn.next = head;
        head = nn;
    }

    public void addAtTail(int val) {

        Node nn = new Node(val);

        if(head == null) {
            head = nn;
            return;
        }

        Node curr = head;

        while(curr.next != null) {
            curr = curr.next;
        }

        curr.next = nn;
    }

    public void addAtIndex(int index, int val) {

        if(index < 0)
            return;

        if(index == 0) {
            addAtHead(val);
            return;
        }

        Node curr = head;

        for(int i = 0; i < index - 1; i++) {

            if(curr == null)
                return;

            curr = curr.next;
        }

        if(curr == null)
            return;

        Node nn = new Node(val);

        nn.next = curr.next;
        curr.next = nn;
    }

    public void deleteAtIndex(int index) {

        if(head == null || index < 0)
            return;

        if(index == 0) {
            head = head.next;
            return;
        }

        Node curr = head;

        for(int i = 0; i < index - 1; i++) {

            if(curr == null)
                return;

            curr = curr.next;
        }

        if(curr == null || curr.next == null)
            return;

        curr.next = curr.next.next;
    }
}