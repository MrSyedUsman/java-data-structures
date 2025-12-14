public class QueueArray {
    int front = 0, rear = -1, size = 5;
    int[] queue = new int[size];

    void enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Queue Full");
            return;
        }
        queue[++rear] = x;
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Empty");
            return;
        }
        System.out.println("Removed: " + queue[front++]);
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(5);
        q.enqueue(10);
        q.dequeue();
    }
}
