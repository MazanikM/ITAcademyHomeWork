package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface implements ICalculator {

    private long countOperations = 0;
    ICalculator calc;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calc){
        this.calc = calc;
    }

    @Override
    public double doDivision(double a, double b) {
        countOperations++;
        return calc.doDivision(a, b);
    }

    @Override
    public double doMultiplication(double a, double b) {
        countOperations++;
        return calc.doMultiplication(a, b);
    }

    @Override
    public double doSubtraction(double a, double b) {
        countOperations++;
        return calc.doSubtraction(a, b);
    }

    @Override
    public double doSumm(double a, double b) {
        countOperations++;
        return calc.doSumm(a, b);
    }

    @Override
    public double doPov(double a, int b) {
        countOperations++;
        return calc.doPov(a, b);
    }

    @Override
    public double doAbs(double a) {
        countOperations++;
        return calc.doAbs(a);
    }

    @Override
    public double doSqrt(double a) {
        countOperations++;
        return calc.doSqrt(a);
    }

    public long getCountOperation(){
        return countOperations;
    }
}
