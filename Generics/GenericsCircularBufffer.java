package Generics;

public class GenericsCircularBufffer<T> {//T is type
    private T[] buffer;
    private int readCursor = 0;
    private int writeCursor = 0;
    public GenericsCircularBufffer(int size)
    {
        buffer = (T[])new Object[size];//casting to T type
    }
    public boolean offer(T value){ // to write in buffer
        if (buffer[writeCursor] != null) {
            return false;
        }
        buffer[writeCursor] = value;
        writeCursor = next(writeCursor);
        return true;
    }
    public T poll() { //to read in buffer
        final T value = buffer[readCursor];
        if (value != null){
            buffer[readCursor] = null;
            readCursor = next(readCursor);
        }
        return value;
    }
    private int next(int index){
        return (index+1) % buffer.length;
    }
}
