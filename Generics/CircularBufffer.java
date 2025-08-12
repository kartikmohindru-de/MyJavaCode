package Generics;

public class CircularBufffer {
    private Object[] buffer;
    private int readCursor = 0;
    private int writeCursor = 0;
    public CircularBufffer(int size)
    {
        buffer = new Object[size];
    }
    public boolean offer(Object value){ // to write in buffer
        if (buffer[writeCursor] != null) {
            return false;
        }
        buffer[writeCursor] = value;
        writeCursor = next(writeCursor);
        return true;
    }
    public Object poll() { //to read in buffer
        final Object value = buffer[readCursor];
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
