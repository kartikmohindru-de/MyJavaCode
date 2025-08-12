public class MainForInheritance {
    public  static void main(String Args[]){
        InheritanceExample_Derived ID = new InheritanceExample_Derived();
        ID.add1Package(2,10,30);
        ID.method1();
        InheritanceExample_Main IM = new InheritanceExample_Derived();
        IM.method1();//IM cannot call any derived class function because func calling depends on type and not instance of class
        System.out.println(IM.getSeats()); //it is calling its own method but as it is of derived instance derived clas s overrides main class function as it is tied to instance type not reference type
        System.out.println(IM instanceof InheritanceExample_Derived);
        //IM instanceof InheritanceExample_Derived ? ((InheritanceExample_Derived) IM) : null; kind of type casting to the derived class
        InheritanceExample_Main IM1 = new InheritanceExample_Main();
        System.out.println(IM1.seats);
        InheritanceExample_Derived ID1 = new InheritanceExample_Derived();
        System.out.println(ID1.seats); //derived class value hides main class value for same var
        //parent type can be instantiated as child instance but not other way around that is  InheritanceExample_Derived ID1 = new InheritanceExample_Main(); error
        System.out.println(IM1.hasSeats(13)); // considering 150 seats
        System.out.println(ID1.hasSeats(13)); // considering 150 seats although it is pointing to 12 seats in its own class instance because it hides it never overwrite
        // to handle this we generally use method overriding as derived class overrides main class methods making it higher on priority
        System.out.println(IM1.hasSeats());
        System.out.println(ID1.getSeats()); // considering 150 seats
        System.out.println(ID1.hasSeats());
        // for fields it is the type of reference  that takes precedence
        // for methods it is the type of instance that takes precedence
        //type of reference obj = new type of instance

    }
}
