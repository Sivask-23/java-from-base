public class creation {
    Node head;
    private int size;

    creation(){
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
        Node currNode=head;
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        while (currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

//     delete at first
    public void delFirst(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        size--;
    }

//    delete at last
    public void delLast(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next==null){
            head=null;
            return;
        }
        Node lastNode=head.next;
        Node prevnode=head;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            prevnode=prevnode.next;
        }
        prevnode.next=null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        creation list=new creation();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.printList();
        list.addLast("Last node");
        list.printList();
        list.delFirst();
        list.printList();
        list.delLast();
        list.printList();
        list.addFirst("This");
        list.printList();
        System.out.println("Size of list is "+list.getSize());

    }
}
