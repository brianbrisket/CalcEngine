package training.ps.myapp;

import training.ps.calcengine.*;

public class Main {

    public static void main(String[] args) {

        // useCalculateHelper();

        //CalculateHelper helper = new CalculateHelper();

        DynamicHelper helper = new DynamicHelper(new MathProcessing[]{
                new Adder(),
                new PowerOf()
        });

        String[] statements = {
                "add 25.0 92.0",    // 25.0 + 92.0 = 117.0
                "power 5.0 2.0"     // 5.0 ^ 2.0 = 25.0
        };

        for(String statement : statements) {
                String output = helper.process(statement);
                System.out.println(output);
        }
/*
        static void useCalculateHelper() {
            String[] statements = {
                    "divide 100.0 50.0",
                    "add 25.0 92.0",
                    "subtract 225.0 17.0",
                    "multiply 11.0 3.0"
            };
        }
*/

//        for(CalculateBase equation : equations) {
//            equation.calculate();
//            System.out.print("result = ");
//            System.out.println(equation.getResult());
//        }
    }
}
