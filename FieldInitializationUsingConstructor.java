public class FieldInitializationUsingConstructor {
    private int passenger;
    private int seats;
    FieldInitializationUsingConstructor() {
        seats = 150;
        passenger = 0;
        freeseats=0;
        perbagFee=0;
    }
    FieldInitializationUsingConstructor(int seats) {
        //Parameterized constructor, once we provide this we have to create all variations of the constructires being expected
        this(seats%2 == 0 ? 25.0:50.0);
        this.seats = seats;
        this.passenger = 0;
    }
   private FieldInitializationUsingConstructor(double perbagfee) {
        //as we do not want to over load this constructor from initialization as it is dependent on the condition above
       //we made it private
        //Parameterized constructor, once we provide this we have to all variations of the constructires being expected
        this.perbagFee=perbagfee;
    }
    FieldInitializationUsingConstructor(int seats,int freeseats) {
        //Parameterized constructor, once we provide this we have to all variations of the constructires being expected
        this(seats);// it is equivalent to seats = seats but as we are already doing this always to be first line
        //it is a way to call a constructor inside a constructore called chaining constructors.

        freeseats=freeseats;
        passenger = 0;
    }
}
