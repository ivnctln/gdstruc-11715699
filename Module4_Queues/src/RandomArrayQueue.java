import java.util.NoSuchElementException;
import java.util.Iterator;

public class RandomArrayQueue<Player> implements Iterable<Player> {
    private int size;
    private Player[] queue;
    private int first;
    private int last;

    private void resize(int capacity) {
        assert capacity >= size;
        Player[] temp = (Player[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = queue[(first + i) % queue.length];
        }

        queue = temp;

        first = 0;
        last = size;
    }

    public RandomArrayQueue() {
        this(1000);
    }

    public RandomArrayQueue(int capacity) {
        queue = (Player[]) new Object[capacity];
        size = 0;
        first = 0;
        last = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(Player player) {
        if (size == queue.length) {
            resize(queue.length * 2);
        }

        queue[last++] = player;

        if (last == queue.length) {
            last = 0;
        }

        size++;
    }

    public Player dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }

        Player player = queue[first];
        queue[first] = null;
        size--;
        first++;

        if (first == queue.length) {
            first = 0;
        }

        if (size > 0 && size == queue.length / 4) {
            resize(queue.length / 2);
        }

        return player;
    }

    private void swap(int left, int right) {
        Player temp = queue[right];
        queue[right] = queue[left];
        queue[left] = temp;
    }

    public Player randomDequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }

        int index;
        if (last > first) {
            index = (int) (Math.random() * (last - first));
        } else {
            int length = last + queue.length - first;
            index = (first + (int) (Math.random() * length)) % queue.length;
        }

        swap(first + index, first);
        return dequeue();
    }


    public int size() {
        return size;
    }

    public Iterator<Player> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<Player> {
        private int i = 0;

        public boolean hasNext() {
            return i < size;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Player next() {
            if (!hasNext()) throw new NoSuchElementException();
            Player player = queue[(i + first) % queue.length];
            i++;

            return player;
        }
    }



    public void printQueue() {
        for (int i = last; i < first; i++) {
            System.out.println(queue[i]);
        }
    }
}