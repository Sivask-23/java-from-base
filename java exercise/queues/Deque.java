
import java.util.Iterator;
import java.util.NoSuchElementException;


public class Deque<Item> implements Iterable<Item> {
    private Node<Item> first;
    private Node<Item> last;
    private int size;

    private static class Node<Item> {

        private Item item;
        private Node<Item> next;
        private Node<Item> prev;
    }

    public Deque() {
        first = null;
        last = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item should not be null");
        }
        Node<Item> oldFirst = first;
        first = new Node<>();
        first.item = item;
        first.next = oldFirst;
        if (isEmpty()) {
            last = first;
        } else {
            oldFirst.prev = first;
        }
        size++;
    }

    public void addLast(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Iyem should not be null");
        }
        Node<Item> oldLast = last;
        last = new Node<>();
        last.item = item;
        last.prev = oldLast;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        size++;
    }

    public Item removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("No element found");
        }
        Item item = first.item;
        first = first.next;
        size--;
        if (isEmpty()) {
            last = null;
        } else {
            first.prev = null;
        }
        return item;
    }

    public Item removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("No element found");
        }
        Item item = last.item;
        last = last.prev;
        size--;
        if (isEmpty()) {
            first = null;
        } else {
            last.next = null;
        }
        return item;
    }

    private class DequeIterator<Item> implements Iterator<Item> {
        private Node<Item> curr;

        public DequeIterator(Node<Item> first) {
            curr = first;
        }

        public boolean hasNext() {
            return curr != null;
        }

        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Item item = curr.item;
            curr = curr.next;
            return item;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<Item> iterator() {
        return new DequeIterator<>(first);
    }


    public static void main(String[] args) {

        Deque<Integer> d = new Deque<>();
        System.out.println(d.isEmpty());
        d.addFirst(1);
        d.addLast(2);
        d.addFirst(0);
        d.addLast(3);
        d.addLast(100);
        System.out.println(d.size());
        for (int i : d) {
            System.out.print(i + "->");
        }
        System.out.println("null");
        try {
            d.addFirst(null);
        } catch (IllegalArgumentException e) {
            System.out.println("caught exception for addFirst(null)");
        }
        try {
            d.removeLast();
            d.removeLast();
            d.removeLast();
            d.removeLast();
            d.removeLast();
        } catch (NoSuchElementException e) {
            System.out.println("caught exception for no element found");
        }

        d.addFirst(1);
        d.addFirst(0);
        d.addLast(5);
        d.addLast(6);

        Iterator<Integer> itr = d.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        try {
            itr.next();
        } catch (NoSuchElementException e) {
            System.out.println("caught");
        }
    }
}
