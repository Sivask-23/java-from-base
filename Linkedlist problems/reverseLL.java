//reverse linked list without extra space
public class reverseLL {
    Node head;
    private int size;

    reverseLL() {
        size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newnode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }


    public void reverseIterative() {  // iterative method
        if (head == null) {
            System.out.println("List empty");
            return;
        }
        if (head.next == null) {
            System.out.println(head.data);
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev; // changing link from curr node to prev node

//            updating curr, next and prev
            prev = curr;
            curr = next; // node next is already defined in the top after while loop

        }
        head.next = null; // link remained in first stage should be removed
        head = prev;  //  head will point to last node as first node bcs of reversed
    }
    public Node reverseRecursive(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node newHead=reverseRecursive(head.next); // will take care of upper nodes in the stack
        head.next.next=head;
        head.next=null;

        return newHead;
    }

    public static void main(String[] args) {

        reverseLL l1 = new reverseLL();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.printList();
        System.out.println("Size is " + l1.getSize());
        l1.head=l1.reverseRecursive(l1.head); // giving new head from fn to LL
        l1.printList();

    }
}
