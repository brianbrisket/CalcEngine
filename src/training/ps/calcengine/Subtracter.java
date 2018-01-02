package training.ps.calcengine;

public class Subtracter extends CalculateBase {

    public Subtracter() {}

    public Subtracter(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    public void calculate() {
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
