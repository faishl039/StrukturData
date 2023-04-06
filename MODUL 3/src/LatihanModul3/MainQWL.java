package LatihanModul3;

public class MainQWL {
    public static void main(String[] args) {
        LinkQueue queue = new LinkQueue();

        queue.enqueue(10);
        queue.enqueue(40);
        queue.displayQueue();

        queue.enqueue(50);
        queue.enqueue(5);
        queue.displayQueue();

        queue.dequeue();
        queue.displayQueue();
    }
}
