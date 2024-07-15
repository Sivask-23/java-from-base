import edu.princeton.cs.algs4.StdRandom;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RandomizedQueue<Item> implements Iterable<Item> {

    private Item[] queue;
    private int size;

//    creating constructor

    public RandomizedQueue() {
        queue = (Item[]) new Object[2]; // here 2 is initial size of array
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void resize(int res) {  // res means size to be resized

        Item[] temp = (Item[]) new Object[res];
        for (int i = 0; i < size; i++) {
            temp[i] = queue[i];
        }
        queue = temp;

    }

    public void enqueue(Item data) {
        if (data == null) {
            throw new IllegalArgumentException("data should not be null");
        }
        if (size == queue.length) {
            resize(2 * queue.length);
        }
        queue[size++] = data;

    }

    public Item dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Element not found");
        }
        int randomNumber = StdRandom.uniformInt(size); // getting random number within bound of size
        Item item = queue[randomNumber]; // item from index generated by random
        queue[randomNumber] = queue[size - 1]; // assigning last element of array to removed index place and thus maintain continuity in array
        queue[size - 1] = null; // assigning null to last element of array
        if (size > 0 && (size == queue.length / 4)) {
            resize(queue.length / 2);   // shrinking of array
        }
        size--;
        return item;
    }

    public Item sample() {
        if (isEmpty()) {
            throw new NoSuchElementException("Element not found");
        }
        int index = StdRandom.uniformInt(size);
        return queue[index];
    }

    private class RandomizedQIterator implements Iterator<Item> {

        private final Item[] tempqueue;
        private int cur;

        public RandomizedQIterator() {

            tempqueue = (Item[]) new Object[size];
            for (int i = 0; i < size; i++) {
                tempqueue[i] = queue[i];
            }
            StdRandom.shuffle(tempqueue);
            cur = 0;

        }

        public boolean hasNext() {
            return cur < tempqueue.length;
        }

        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Empty");
            }
            return tempqueue[cur++];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

    public Iterator<Item> iterator() {
        return new RandomizedQIterator();
    }


    public static void main(String[] args) {

        RandomizedQueue<Integer> r = new RandomizedQueue<>();
        r.enqueue(5);
        r.enqueue(7);
        r.enqueue(8);
        r.enqueue(12);
        System.out.println(r.sample());
        for (int i : r) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(r.dequeue());
        while (!r.isEmpty()) {
            System.out.println(r.dequeue());
        }

    }
}