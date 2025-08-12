public class Main {
    public static void Main(String[] args){
        int i = 12;
        int j = 2;
        try {
            int res = i/(j-2);
            System.out.println(res);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();//very helpful in degubbing as it prints the whole stack trace
        }
        System.out.println("We will be able to contine the program");
    }
}
