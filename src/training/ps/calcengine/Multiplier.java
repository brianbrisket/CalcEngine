package training.ps.calcengine;

public class Multiplier extends CalculateBase {

    public Multiplier() {}

    public Multiplier(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    public void calculate() {
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }
}
