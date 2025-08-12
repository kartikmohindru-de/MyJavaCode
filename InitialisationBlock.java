public class InitialisationBlock {
    private int   seats = 150;
    private int flightNumber;
    private char flightClass;
    public boolean[] isSeatAvailable = new boolean[seats];

    {
        //this is initialisation block, it gets called whenever a class is instantiated no matter which constructor or function is called.
        for(int i = 0; i<seats;i++){
            isSeatAvailable[i] = true;
        }
        System.out.println(isSeatAvailable.length);
    }
    public  InitialisationBlock(int seats){
        this.seats = seats;
        isSeatAvailable = new boolean[seats];

    }

    public static void main(String[] args){
        //InitialisationBlock ob = new InitialisationBlock(); // just creating the object ran the initilisation block
        //int val = ob.passengers;
        InitialisationBlock ob1 = new InitialisationBlock(450); // this will re create the array but the initialisation block will run before it
        System.out.println(ob1.isSeatAvailable[9]);
    }
}
