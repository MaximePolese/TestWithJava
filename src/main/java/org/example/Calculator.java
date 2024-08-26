package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public String divide(int a, int b) {
        if (b == 0) {
            return "Cannot divide by zero";
        }
        return String.valueOf(a / b);
    }

    public float addFloat(float a, float b) {
        return truncateResult(a + b);
    }

    public float subtractFloat(float a, float b) {
        return truncateResult(a - b);
    }

    public float multiplyFloat(float a, float b) {
        return truncateResult(a * b);
    }

    public String divideFloat(float a, float b) {
        if (b == 0) {
            return "Cannot divide by zero";
        }
        return String.valueOf(truncateResult(a / b));
    }

    public float truncateResult(float result) {
        BigDecimal bd = new BigDecimal(Float.toString(result));
        bd = bd.setScale(7, RoundingMode.HALF_UP);
        System.out.println(bd);
        return bd.floatValue();
    }
}
