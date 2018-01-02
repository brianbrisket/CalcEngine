package training.ps.calcengine;

public abstract class CalculateBase {

    // Fields

    private double leftVal;
    private double rightVal;
    private double result;

    // Getters and Setters

    public double getLeftVal() { return leftVal; }
    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }
    public double getRightVal() { return rightVal; }
    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }
    public double getResult() { return result; }
    public void setResult(double result) {
        this.result = result;
    }

    // Constructors

    public CalculateBase() {}

    public CalculateBase(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    // Abstract Method

    public abstract void calculate();
}
