import java.util.LinkedList;

public class LLusingCollection {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(4);
        l1.add(5);
        l1.add(9);
        l1.add(2);
        l1.add(10);
        while (!l1.isEmpty()) {
            System.out.println(l1.peek());
            l1.remove();
        }
        System.out.println(l1);
        l1.addFirst(2);
        l1.addLast(1);
        l1.add(1, 5);
        l1.addLast(0);
        l1.addLast(6);
        l1.addLast(56);
        l1.addLast(21);
        System.out.println(l1);
        l1.remove(3);
        for (Integer i : l1) {
            System.out.print(i + " -> ");
        }
        System.out.print("NULL");
    }
}
