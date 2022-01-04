package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoComposite {
    private long countOperation = 0;
    CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();

    public double doDivision (double a, double b){
        countOperation++;
        return calculator.doDivision(a,b);
    }
    public double doMultiplication (double a, double b){
        countOperation++;
        return calculator.doMultiplication(a,b);
    }
    public double doSubtraction (double a, double b){
        countOperation++;
        return calculator.doSubtraction(a,b);
    }
    public double doSumm (double a, double b){
        countOperation++;
        return calculator.doSumm(a,b);
    }
    public double doPov(double a, int b) {
        countOperation++;
        return calculator.doPov(a,b);
    }
    public double doAbs(double a) {
        countOperation++;
        return calculator.doAbs(a);
    }
    public double doSqrt(double a) {
        countOperation++;
        return calculator.doSqrt(a);
    }
    public long getCountOperation(){
        return countOperation;
    }
}
