package Generics;

public class CallCircularBuffer {
    public static void main(String[] args){
        CircularBufffer buffer = new CircularBufffer(2);
        buffer.offer(1);
        System.out.println(buffer.poll()); // result 1
        System.out.println(buffer.poll()); //empty
        buffer.offer(1); //1
        buffer.offer(2);//
        System.out.println(buffer.poll());//1
        buffer.offer(1);
        buffer.offer(1);
        System.out.println(buffer.offer(4));//false because its going beyond the size


    }
}
