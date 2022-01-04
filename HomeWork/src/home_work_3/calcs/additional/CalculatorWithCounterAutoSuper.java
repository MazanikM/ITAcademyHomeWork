package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long countOperation = 0;

    @Override
    public double doDivision(double a, double b) {
        countOperation++;
        return super.doDivision(a, b);
    }

    @Override
    public double doMultiplication(double a, double b) {
        countOperation++;
        return super.doMultiplication(a, b);
    }

    @Override
    public double doSubtraction(double a, double b) {
        countOperation++;
        return super.doSubtraction(a, b);
    }

    @Override
    public double doSumm(double a, double b) {
        countOperation++;
        return super.doSumm(a, b);
    }

    @Override
    public double doPov(double a, int b) {
        countOperation++;
        return super.doPov(a, b);
    }

    @Override
    public double doAbs(double a) {
        countOperation++;
        return super.doAbs(a);
    }

    @Override
    public double doSqrt(double a) {
        countOperation++;
        return super.doSqrt(a);
    }

    public long getCountOperation(){
        return countOperation;
    }
}
