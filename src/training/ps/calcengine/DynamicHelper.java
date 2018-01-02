package training.ps.calcengine;

public class DynamicHelper {
    private MathProcessing[] handlers;

    public DynamicHelper(MathProcessing[] handlers) {
        this.handlers = handlers;
    }

    public String process(String statement) {

        String[] parts = statement.split(MathProcessing.SEPARATOR);
        String keyword = parts[0];  // add

        MathProcessing theHandler = null;

        for (MathProcessing handler:handlers) {
            if (keyword.equalsIgnoreCase(handler.getKeyword())) {
                theHandler = handler;
                break;
            }
        }

        double leftVal = Double.parseDouble(parts[1]);  // 1.0
        double rightVal = Double.parseDouble(parts[2]);  // 2.0

        double result = theHandler.doCalculation(leftVal, rightVal);


        StringBuilder equation = new StringBuilder(60);
        equation.append(String.valueOf(leftVal));
        equation.append(' ');
        equation.append(theHandler.getSymbol());
        equation.append(' ');
        equation.append(String.valueOf(rightVal));
        equation.append(" = ");
        equation.append(String.valueOf(result));

        return equation.toString();
    }
}
