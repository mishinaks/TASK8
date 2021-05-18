package calculator.operation;

public class Subtraction implements Operation{
    @Override
    public double returnResult(double x, double y) {
        double result = x - y;
        return result;
    }
}
