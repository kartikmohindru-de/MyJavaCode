public class MathEquation {
    private Double LeftVal = 0.0;
    private Double RightVal = 0.0;
    private char OpCode ;
    private double result;

   void execute() {
        switch (OpCode) {
            case 'a' :
                result = LeftVal + RightVal;
                break;
            case 's' :
                result = LeftVal - RightVal;
                break;
            case 'd' :
                result = LeftVal / RightVal;
                break;
            case 'm' :
                result = LeftVal * RightVal;
                break;
            default:
                System.out.println("Enter valid Operation code");
                break;
        }

    }

    public MathEquation(char opCode){
        this.OpCode =opCode;
    }
    public MathEquation(double leftVal, double rightVal,char opCode){
        this(opCode);
        this.LeftVal = leftVal;
        this.RightVal = rightVal;
    }

    public double getResult() {
       return result;
    }
/*
    public void setLeftVal(double lVal){
        LeftVal = lval;
    }
    public void setRightVal(double rval){
        RightVal = rval;
    }
    public void setOpcode(char opval){
        OpCode = opval;
    }
    */



}
