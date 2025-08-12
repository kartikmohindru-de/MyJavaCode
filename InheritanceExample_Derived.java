public class InheritanceExample_Derived extends InheritanceExample_Main{
    float maxCargoSpace = 1000;
    float usedCargoSpace;
    float seats = 12;
    int getSeats(){return 12;}
    public void add1Package(float h, float w, float d){
        float size = h*w*d;
        if(hasCargoSpace(size))
            usedCargoSpace += size;
        else
            handleNoSpace();
    }
    private boolean hasCargoSpace(float size){
        return usedCargoSpace + size <= maxCargoSpace;
    }
    private void handleNoSpace(){
        System.out.println("Not Enough Space");
    }
    public static void main(String args[]){

    }
}
