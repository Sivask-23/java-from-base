import java.util.Queue;

public class QusingArray {
    public static class Queue{
        static int[] ar;
        static  int size;
        static  int rear=-1;

        Queue(int size){
            this.size=size;
            ar=new int[size];
        }

        public static boolean isEmpty(){
            return rear==-1;
        }
        public static void enq(int data){
            if (rear==size-1){
                System.out.println("Q full");
            }
            rear++;
            ar[rear]=data;
        }

        public static int deq(){
            if (isEmpty()){
                return -1;
            }
            int front=ar[0];
            for (int i = 0; i < rear; i++) {
                ar[i]=ar[i+1];
            }
            rear--;
            return front;

        }

        public static void peek(){
            if (isEmpty()){
                System.out.println("Q empty");
            }
            System.out.println(ar[0]);
        }

    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.enq(1);
        q.enq(2);
        q.enq(3);
        q.enq(4);

        while (!q.isEmpty()){
            q.peek();
            q.deq();
        }
    }
}
