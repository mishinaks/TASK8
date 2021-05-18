import calculator.operation.*;
import org.junit.Assert;
import org.junit.Test;

public class test {

    @Test
    public void testAdditionРositiveNumber() {
        Addition addition = new Addition();
        Assert.assertEquals("ERROR", 4, addition.returnResult(3, 1), 0);
    }

    @Test
    public void testAdditionNegativeNumber() {
        Addition addition = new Addition();
        Assert.assertEquals("ERROR", -5, addition.returnResult(-2, -3), 0);
    }

    @Test
    public void testMultiplicationРositiveNumber() {
        Multiplication multiplication = new Multiplication();
        Assert.assertEquals("ERROR", 120, multiplication.returnResult(10, 12), 0);
    }

    @Test
    public void testMultiplicationNegativeNumber() {
        Multiplication multiplication = new Multiplication();
        Assert.assertEquals("ERROR", -20, multiplication.returnResult(-10, 2), 0);
    }


    @Test
    public void testSubtractionРositiveNumber() {
        Subtraction subtraction = new Subtraction();
        Assert.assertEquals("ERROR", 7, subtraction.returnResult(10, 3), 0);
    }

    @Test
    public void testSubtractionNegativeNumber() {
        Subtraction subtraction = new Subtraction();
        Assert.assertEquals("ERROR", -8, subtraction.returnResult(-10, -2), 0);
    }

    @Test
    public void testDivisionРositiveNumber() {
        Division division = new Division();
        Assert.assertEquals("ERROR", 5, division.returnResult(10, 2), 0);
    }

    @Test
    public void testDivisionNegativeNumber() {
        Division division = new Division();
        Assert.assertEquals("ERROR", -2, division.returnResult(-10, 5), 0);
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        Division division = new Division();
        division.returnResult(15, 0);
    }
}
