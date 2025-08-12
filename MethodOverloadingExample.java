public class MethodOverloadingExample {
    private int passenger = 150;
    private int seats = 300;
    private int totalCheckedBags = 2;
    public void Add1Passenger(){
        if(hasSeating()){
            passenger +=1;
        }
    }
    public void setCheckedBags(int bags){
        this.totalCheckedBags = totalCheckedBags+bags;
    }
    public int getCheckedBags(){
       return this.totalCheckedBags ;
    }
    public void Add1Passenger(int bags){
        if(hasSeating()){
            Add1Passenger();
            totalCheckedBags += bags;
        }
    }
    public void Add1Passenger(int... bags){// variable number of parameters, the parameter with variable length of values will be the last one to be declared,
        // method receives the variable length params as array
        //variable length params notation datatype... variable name
        if(hasSeating()){
            Add1Passenger();
            totalCheckedBags += bags[0];
        }
    }
    public void Add1Passenger(MethodOverloadingExample p1){
        Add1Passenger(p1.totalCheckedBags);
    }
    public void Add1Passenger(int bags,int carryons){
        if(carryons<=2){
            Add1Passenger(bags);
        }
    }
    public void Add1Passenger(MethodOverloadingExample p1, int carryons){
        Add1Passenger(p1.getCheckedBags(),carryons);
    }

   /* public void Add2Passenger( int seat, int bags=2){
        // public void Add2Passenger( int seat, int bags=2) default param approach have got discarded but can be reused wither by overloading or using builder pattern
        if(hasSeating()){
            Add1Passenger();
            totalCheckedBags += bags;
        }
    }*/
    public boolean hasSeating(){
        return passenger<seats;
    }
    public static void main(String args[]){
        MethodOverloadingExample mo = new MethodOverloadingExample();
        mo.setCheckedBags(4);
        mo.Add1Passenger(mo.getCheckedBags());
        System.out.println(mo.passenger);
        System.out.println(mo.totalCheckedBags);

    }
}
//automatic type conversion can take place for overloading that is short type internally gets coverted  to int hence if compiler is not able to find exact match it will
// do typecasting of variable and search passed before throwing error