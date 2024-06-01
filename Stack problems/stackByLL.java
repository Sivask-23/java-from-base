public class stackByLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head ==null;
        }
        public static void push(int data){
            Node newnode=new Node(data);
            if (isEmpty()){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
        public static int pop(){
            if (isEmpty()){
                System.out.println("Stack empty");
                return 0;
            }
            int top= head.data;
            head=head.next;
            return top;
        }
        public static void peek(){
            if (isEmpty()){
                System.out.println("Stack Empty");
                return;
            }
            System.out.println(head.data);
        }


    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()){
            s.peek();
            System.out.println("↑");
            s.pop();
        }

    }
}
