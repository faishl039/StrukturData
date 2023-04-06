package LatihanModul3;

public class LinkQueue {

    public FirstLastList theList;
    public LinkQueue(){
        theList = new FirstLastList();
    }
    public boolean isEmpty(){
        return theList.isEmpty();
    }
    public void enqueue(int j){
        theList.insertLast(j);
    }
    public long dequeue(){
        return theList.deleteFirst();
    }
    public void displayQueue(){
        System.out.println("queue Head-->Tail : ");
        theList.displayList();
    }

}
