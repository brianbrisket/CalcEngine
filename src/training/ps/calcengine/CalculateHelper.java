package training.ps.calcengine;

public class CalculateHelper {
    private static final char ADD_SYMBOL = '+';
    private static final char SUBTRACT_SYMBOL = '-';
    private static final char MULTIPLY_SYMBOL = '*';
    private static final char DIVIDE_SYMBOL = '/';

    MathCommand command;
    double leftVal;
    double rightVal;
    double result;

    public void process(String statement) {
        String[] parts = statement.split(" ");
        String commandString = parts[0];
        leftVal = Double.parseDouble(parts[1]);  //  why not valueOf???
        rightVal = Double.parseDouble(parts[2]);  // why not valueOf??

        setCommandFromString(commandString);

        CalculateBase calculator = null;

        switch(command) {
            case Add:
                calculator = new Adder(leftVal, rightVal);
                break;
            case Subtract:
                calculator = new Subtracter(leftVal, rightVal);
                break;
            case Multiply:
                calculator = new Multiplier(leftVal, rightVal);
                break;
            case Divide:
                calculator = new Divider(leftVal, rightVal);
                break;
        }

        calculator.calculate();
    }

    private void setCommandFromString(String statement) {
        if (statement.equalsIgnoreCase(MathCommand.Add.toString()))
            command = MathCommand.Add;
        else if (statement.equalsIgnoreCase(MathCommand.Subtract.toString()))
            command = MathCommand.Subtract;
        else if (statement.equalsIgnoreCase(MathCommand.Multiply.toString()))
            command = MathCommand.Multiply;
        else if (statement.equalsIgnoreCase(MathCommand.Divide.toString()))
            command = MathCommand.Divide;
    }

    @Override
    public String toString() {
        // 1.0 + 2.0 = 3.0
        char symbol = ' ';
        switch(command) {
            case Add:
                symbol = ADD_SYMBOL;
                break;
            case Subtract:
                symbol = SUBTRACT_SYMBOL;
                break;
            case Multiply:
                symbol = MULTIPLY_SYMBOL;
                break;
            case Divide:
                symbol = DIVIDE_SYMBOL;
                break;
        }

        StringBuilder equation = new StringBuilder(60);
        equation.append(String.valueOf(leftVal));
        equation.append(' ');
        equation.append(symbol);
        equation.append(' ');
        equation.append(String.valueOf(rightVal));
        equation.append(" = ");
        equation.append(String.valueOf(result));

        return equation.toString();
    }


}
