public class CQusingArray {
    public static class Cqueue {
        static int[] ar;
        static int size;
        static int rear = -1;
        static int front = -1;

        Cqueue(int size) {
            this.size = size;
            ar = new int[size];
        }

        public static boolean isEmpty() {
            return (rear == -1 && front == -1);
        }

        public static boolean isFull() {
            return ((rear + 1) % size == front);
        }

        public static void enq(int data) {
            if (isFull()) {
                System.out.println("CQ full");
                return;
            }
            // if its first element
            if (front == -1) {
                front=0;
            }
            rear = (rear + 1) % size;
            ar[rear] = data;
        }

        public static int deq() {
            if (isEmpty()) {
                return -1;
            }
            int ele = ar[front];
//            having one element
            if (front == rear) {
                rear = front = -1;
            }else {
                front = (front + 1) % size;
            }
            return ele;
        }

        public static void peek(){
            if (isEmpty()){
                System.out.println("CQ empty");
            }
            System.out.println(ar[front]);
        }

    }

    public static void main(String[] args) {

        Cqueue cq=new Cqueue(5);
        cq.enq(1);
        cq.enq(2);
        cq.enq(3);
        cq.enq(4);
        cq.enq(5);
        cq.deq();
        cq.enq(15);

        while (!cq.isEmpty()){
            cq.peek();
            cq.deq();
        }

    }
}
