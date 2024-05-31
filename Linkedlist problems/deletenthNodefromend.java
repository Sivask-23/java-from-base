public class deletenthNodefromend {
    Node head;
    private int size;
    deletenthNodefromend(){
        size=0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addFirst(int data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addLast(int data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newnode;
    }
    public void printList(){
        if (head==null){
            System.out.println("Empty list");
            return;
        }
        Node currNode=head;
        while (currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("null");

    }
    public int getSize(){
        return size;
    }

//    delete nth node from end

    public Node deleteNthfrmEnd(Node head, int n){
        if (head.next==null){
            return null;
        }
        if (n==size){
            return head.next;
        }
        int itemindex=size-n;
        int i=1;
        Node prev=head;
        while (i<itemindex){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;

        return head;
    }

    public static void main(String[] args) {

        deletenthNodefromend l1=new deletenthNodefromend();
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.printList();
        int n=1;
        l1.head=l1.deleteNthfrmEnd(l1.head, n);
        l1.printList();

    }
}
