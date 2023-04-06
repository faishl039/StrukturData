package LatihanModul3;

public class StackWithoutLib {
    private int maxSz;
    private long[] stackArray;
    private int top;

    public StackWithoutLib(int a){
        maxSz =3;
        stackArray = new long[maxSz];
        top = -1;
    }

    public void push(long l){
        stackArray[++top] = l;
    }
    public long pop(){
        return stackArray[top--];
    }
    public long peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == maxSz-1);
    }

}
