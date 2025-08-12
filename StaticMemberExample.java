public class StaticMemberExample {
    //static members are shared class wide, not tied to an instance i.e why accessible using class name
    // all instances of the class will have the same value generally we have instance fields
    // declaration can be done using static keyword
    public int seats = 150;
    public static int allPassengers = 0 ;
    public int passenger = 0;
    public static void StaticMethodExample(){
        //System.out.println(seats); this will throw error because static functions can only access static members
        System.out.println(allPassengers);
        //Static methods should always be declared before general methods
    }
    public void addPassenger(){
        if(passenger<seats){
            passenger = passenger+1;
            allPassengers = allPassengers+1;
        }

    }

    public static void main(String args[]){
        StaticMemberExample eg = new StaticMemberExample();
        System.out.println(eg.allPassengers);
        eg.addPassenger();
        eg.addPassenger();
        System.out.println(eg.passenger); // output will be 2
        System.out.println(eg.allPassengers);// output will be 2
        System.out.println(StaticMemberExample.allPassengers);// output will be 2 // right way to access static var using classname
        StaticMemberExample eg2 = new StaticMemberExample();
        System.out.println(eg2.passenger); // will be 0
        System.out.println(eg2.allPassengers);// will be 2

    }
}
//static import statements are import static path_to_class.StaticFunctionname or path_to_class.*
//after doing the static import clas.itsStaticFunction = StaticFunction
//static initialisation block, will be like normal initialisation block but will have static keyword before it
//static initialisation blocks run before the class is being used for the first time.
