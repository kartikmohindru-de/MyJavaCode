public class InheritanceExample_Main {
    private float usedCargoSpace;
    float seats = 150;
    float passenger = 0;
    int getSeats(){return 150;}

    public void method1(){
        System.out.println("I am parent class method");
    }
    private void method2(){
        System.out.println("I am parent class method2");
    }
    public boolean hasSeats(){
        return passenger < getSeats();
    }
    public boolean hasSeats(float passenger){
        return passenger < seats;
    }

    public static void main(String args[]){
        InheritanceExample_Main mainobj = new InheritanceExample_Main();
        mainobj.method1();


    }
}
