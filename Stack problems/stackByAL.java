import java.util.ArrayList;

public class stackByAL {
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();

        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if (list.isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static void peek(){
            if (list.isEmpty()){
                return;
            }
            System.out.println(list.get(list.size()-1));
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()){
            s.peek();
            s.pop();
        }



    }
}
