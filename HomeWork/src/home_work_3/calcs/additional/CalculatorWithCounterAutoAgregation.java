package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.CalculatorWithOperator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {
    private long countOperation = 0;
    CalculatorWithMathExtends calc1;
    CalculatorWithOperator calc2;
    CalculatorWithMathCopy calc3;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathExtends calc1){
        this.calc1 = calc1;
    }
    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator calc2){
        this.calc2 = calc2;
    }
    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calc3){
        this.calc3 = calc3;
    }

    public double doDivision (double a, double b){
        countOperation++;
        if (calc1 != null){
            return calc1.doDivision(a, b);
        } else if (calc2 != null){
            return calc2.doDivision(a, b);
        } else {
            return calc3.doDivision(a, b);
        }
    }
    public double doMultiplication (double a, double b){
        countOperation++;
        if (calc1 != null){
            return calc1.doMultiplication(a, b);
        } else if (calc2 != null){
            return calc2.doMultiplication(a, b);
        } else {
            return calc3.doMultiplication(a, b);
        }
    }
    public double doSubtraction (double a, double b){
        countOperation++;
        if (calc1 != null){
            return calc1.doSubtraction(a, b);
        } else if (calc2 != null){
            return calc2.doSubtraction(a, b);
        } else {
            return calc3.doSubtraction(a, b);
        }
    }
    public double doSumm (double a, double b){
        countOperation++;
        if (calc1 != null){
            return calc1.doSumm(a, b);
        } else if (calc2 != null){
            return calc2.doSumm(a, b);
        } else {
            return calc3.doSumm(a, b);
        }
    }
    public double doPov(double a, int b) {
        countOperation++;
        if (calc1 != null){
            return calc1.doPov(a, b);
        } else if (calc2 != null){
            return calc2.doPov(a, b);
        } else {
            return calc3.doPov(a, b);
        }
    }
    public double doAbs(double a) {
        countOperation++;
        if (calc1 != null){
            return calc1.doAbs(a);
        } else if (calc2 != null){
            return calc2.doAbs(a);
        } else {
            return calc3.doAbs(a);
        }
    }
    public double doSqrt(double a) {
        countOperation++;
        if (calc1 != null){
            return calc1.doSqrt(a);
        } else if (calc2 != null){
            return calc2.doSqrt(a);
        } else {
            return calc3.doSqrt(a);
        }
    }
    public long getCountOperation(){
        return countOperation;
    }

}
