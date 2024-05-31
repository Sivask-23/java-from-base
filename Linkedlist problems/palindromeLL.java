//check LL palindrome or not without using extra space
public class palindromeLL {
    Node head;
    private int size;

    palindromeLL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

//    add first

    public void addFirst(String data){
        Node newnode= new Node(data);
        if (head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    //    add last
    public void addLast(String data){
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


    //   print list
    public void printList(){

        if (head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while (currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public boolean isPalindrome(Node head){
        if (head==null || head.next==null){
            return true;
        }
        Node middle=findMiddle(head);
        Node secondhalfstart=reverse(middle.next);

        Node firsthalf=head;
        while (secondhalfstart!=null){
            if (firsthalf.data!=secondhalfstart.data){
                return false;
            }
            firsthalf=firsthalf.next;
            secondhalfstart=secondhalfstart.next;
        }
        return true;
    }
    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev; // changing link from curr node to prev node

//            updating curr, next and prev
            prev = curr;
            curr = next;// node next is already defined in the top after while loop
        }
        return prev;
    }
    public Node findMiddle(Node head){
        Node hare=head; // jump 2 times
        Node turtle=head; // jump 1 by 1
        while (hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }

    public static void main(String[] args) {
        palindromeLL l1=new palindromeLL();
        l1.addLast("M");
        l1.addLast("A");
        l1.addLast("A");
        l1.addLast("M");
        l1.printList();
        System.out.println( l1.isPalindrome(l1.head));

    }
}
