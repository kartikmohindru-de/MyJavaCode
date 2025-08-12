package Generics;

import java.util.concurrent.Callable;

public class TypeUnsafeExample {
    public static void main(String[] args) {
        CircularBufffer bufffer = new CircularBufffer(10);
        bufffer.offer("a");
        bufffer.offer("bb");
        bufffer.offer("cc");
        bufffer.offer(1); // this will cause error because of type mismatch
        String ConcatBuffer = concatenate(bufffer);
        System.out.println(ConcatBuffer);
    }

        private static String concatenate (CircularBufffer buffer){
            StringBuilder result = new StringBuilder();
            String value;
            while ((value = (String) buffer.poll()) != null) {
                result.append(value);
            }
            return result.toString();

    }



}
