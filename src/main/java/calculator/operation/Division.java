package calculator.operation;

public class Division implements Operation {
    private Object ArithmeticException;

    @Override
    public double returnResult(double x, double y) {
            if (y == 0){
                int zero = (int) y;
                int res = 1 / zero;
            }
            double result = x / y;
            return result;
    }
}
