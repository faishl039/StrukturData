package LatihanModul3;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public void queueExample() {
        Queue que = new LinkedList();
        que.add("Java");
        que.add("DotNet");
        que.add("PHP");
        que.add("HTML");
        System.out.println("remove : " +que.remove());
        System.out.println("element : " +que.element());
        System.out.println("poll : " +que.poll());
        System.out.println("peek : " +que.peek());
    }

    public static void main(String[] args) {
        new MainQueue().queueExample();
    }
}
