package tyreso.gymnasium._0_extra_challenges;

import java.math.BigDecimal;

public class Calculator {


    public static BigDecimal addition(BigDecimal num1, BigDecimal num2) {
        BigDecimal result = new BigDecimal(0.0);     //initialisera variabeln result
        result = num1.add(num2);
        return result;
    }
    public static BigDecimal subtraction(BigDecimal num1, BigDecimal num2) {
        BigDecimal result;
        result = num1.subtract(num2);
        return result;
    }
    public static BigDecimal multiply(BigDecimal num1, BigDecimal num2) {
        BigDecimal result;
        result = num1.multiply(num2);
        return result;
    }
    public static BigDecimal divition(BigDecimal num1, BigDecimal num2) {
        BigDecimal result;
        result = num1.divide(num2);
        return result;
    }
    public static BigDecimal power(BigDecimal num1, int num2) {
        BigDecimal result = num1.pow(num2);
        return result;
    }
}

