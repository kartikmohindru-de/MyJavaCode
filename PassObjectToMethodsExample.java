public class PassObjectToMethodsExample {
    private int flightNumber;
    public PassObjectToMethodsExample(int flightNumber){
        this.flightNumber = flightNumber;
    }
    public void SetFlightNumber(int flightNumber){
        this.flightNumber = flightNumber;
    }
    public int GetFlightNumber(){
        return this.flightNumber;
    }
    static void swapFlight(PassObjectToMethodsExample ob1,PassObjectToMethodsExample ob2){
        PassObjectToMethodsExample k = ob1;
        ob1 = ob2;
        ob2 = k;
        System.out.println(String.format("%d %d",ob1.flightNumber,ob2.flightNumber)); //20,10
        //the scope is limited to the method only as it gets copy of the reference but never the reference itself as a result the swaping will be visible here but not outside

    }
    static void swapFlightNumber(PassObjectToMethodsExample ob1,PassObjectToMethodsExample ob2){
        int k = ob1.GetFlightNumber();
        ob1.SetFlightNumber(ob2.GetFlightNumber());
        ob2.SetFlightNumber(k);
        System.out.println(String.format("%d %d",ob1.flightNumber,ob2.flightNumber)); //20,10
        //the scope is no more limited to the method only as it is going to alter the members now to the new values so values in reference will change

    }
    public static void main(String args[]){
        PassObjectToMethodsExample ob1 = new PassObjectToMethodsExample(10);
        PassObjectToMethodsExample ob2 = new PassObjectToMethodsExample(20);
        swapFlight(ob1,ob2);
        System.out.println(String.format("%d %d",ob1.flightNumber,ob2.flightNumber));//10,20
        swapFlightNumber(ob1,ob2);
        System.out.println(String.format("%d %d",ob1.flightNumber,ob2.flightNumber));//20,10
    }
}
