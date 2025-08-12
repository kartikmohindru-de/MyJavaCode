package Generics;

public class TypeSafeExample {
    public static void main(String[] args) {
        GenericsCircularBufffer<String> bufffer = new GenericsCircularBufffer<String>(10);
        bufffer.offer("a");
        bufffer.offer("bb");
        bufffer.offer("cc");
        bufffer.offer(1); // this will cause error because of type mismatch
        String ConcatBuffer = concatenate(bufffer);
        System.out.println(ConcatBuffer);
    }

        private static String concatenate (GenericsCircularBufffer<String> buffer){
            StringBuilder result = new StringBuilder();
            String value;
            while ((value = (String) buffer.poll()) != null) {
                result.append(value);
            }
            return result.toString();

    }



}
