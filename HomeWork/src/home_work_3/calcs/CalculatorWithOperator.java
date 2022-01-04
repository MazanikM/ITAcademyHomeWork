package home_work_3.calcs;

public class CalculatorWithOperator {

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
        double result = 1;
        for (int i = 0; i < b; i++){
            result *= a;
        }
        return result;

    }
    public double doAbs (double a){
        if (a < 0){
            return -a;
        }
        return a;
    }
    public double doSqrt (double a){
        return Math.sqrt(a);
    }

}
