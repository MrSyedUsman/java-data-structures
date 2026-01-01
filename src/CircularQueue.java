public class CircularQueue {
    private int[] arr;
    private int front = 0, rear = 0, size = 0;

    public CircularQueue(int capacity) {
        arr = new int[capacity];
    }

    public boolean enqueue(int value) {
        if (size == arr.length) return false;

        arr[rear] = value;
        rear = (rear + 1) % arr.length;
        size++;
        return true;
    }

    public int dequeue() {
        if (size == 0) throw new RuntimeException("Empty Queue");

        int val = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return val;
    }

}
