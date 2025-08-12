public class Main {
   /* static void performCalculations() {
        MathEquation[] equations = new MathEquation[4];
        /*equations[0] = create(100, 50, 'd'); //static functions do not need an object to call
        equations[1] = create(125, 35, 'a');
        equations[2] = create(250, 50, 's');
        equations[3] = create(11, 3, 'm'); //as we have a constructore now in our class we can simply call it rather than using create function
        equations[0] = new MathEquation(100, 50, 'd'); //static functions do not need an object to call
        equations[1] = new MathEquation(125, 35, 'a');
        equations[2] = new MathEquation(250, 50, 's');
        equations[3] = new MathEquation(11, 3, 'm');

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("result = " + equation.getResult());
        }

    } */
    /*
    private static MathEquation create(double leftVal, double rightVal, char opCode) {

        MathEquation equation = new MathEquation(leftVal,rightVal,opCode); this can do the trick as well
       // equation.setLeftVal(leftVal);
        //equation.setRightVal(rightVal);
        //equation.setOpcode(opCode);
        return equation;
    }
    */
    public static void main(String args[]){
        //performCalculations();
        int i = 12;
        int j = 2;
        int k = 5;
        try {
            int res = i/(j-2);
            System.out.println(res);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();//very helpful in degubbing as it prints the whole stack trace
        }
        try {
            int res = i/(k-2);
            System.out.println(res);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();//very helpful in degubbing as it prints the whole stack trace
        }
        System.out.println("We will be able to contine the program");
    }
}
//ctrl_shift+f9 selective build