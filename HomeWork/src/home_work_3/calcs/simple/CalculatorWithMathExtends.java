package home_work_3.calcs.simple;

import home_work_3.calcs.CalculatorWithOperator;
import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    @Override
    public double doDivision(double a, double b) {
        return super.doDivision(a, b);
    }

    @Override
    public double doMultiplication(double a, double b) {
        return super.doMultiplication(a, b);
    }

    @Override
    public double doSubtraction(double a, double b) {
        return super.doSubtraction(a, b);
    }

    @Override
    public double doSumm(double a, double b) {
        return super.doSumm(a, b);
    }

    @Override
    public double doPov(double a, int b) {
        return Math.pow(a,b);
    }

    @Override
    public double doAbs(double a) {
        return Math.abs(a);
    }

    @Override
    public double doSqrt(double a) {
        return Math.sqrt(a);
    }
}
