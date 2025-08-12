public class CommandLineExample {
    public static void main(String[] args){
        if ( args.length < 1 ){
            System.out.println("No Args Found");
        }
        else {
            for (String arg : args){
                System.out.println(arg);
            }
        }
    }
}
