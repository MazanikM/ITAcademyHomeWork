package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public double doDivision (double a, double b){
        return a / b;
    }
    public double doMultiplication (double a, double b){
        return a * b;
    }
    public double doSubtraction (double a, double b){
        return a - b;
    }
    public double doSumm (double a, double b){
        return a + b;
    }
    public double doPov (double a, int b){
        return Math.pow(a,b);
    }
    public double doAbs (double a){
        return Math.abs(a);
    }
    public double doSqrt (double a){
        return Math.sqrt(a);
    }
}
