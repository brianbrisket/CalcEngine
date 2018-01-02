package training.ps.calcengine;

public class Divider extends CalculateBase implements MathProcessing {

    public Divider() {}

    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    public void calculate() {
        double value = getRightVal() != 0 ?
                getLeftVal() / getRightVal() : 0;
        setResult(value);
    }

    @Override
    public String getKeyword() {
        return "divide";
    }

    @Override
    public char getSymbol() {
        return '/';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();

        return getResult();
    }
}
