package LatihanModul3;

public class FirstLastList {
    public QueueWithoutLib first;
    public QueueWithoutLib last;

    public FirstLastList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertLast(int dd){
        QueueWithoutLib qwl = new QueueWithoutLib(dd);
        if (isEmpty()){
            first = qwl;
        } else {
            last.next = qwl;
        }
        last = qwl;
    }

    public int deleteFirst(){
        int temp = (int) first.dData;
        if (first.next == null){
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayList(){
        QueueWithoutLib current = first;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }

}
