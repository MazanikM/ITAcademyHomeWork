package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {

        CalculatorWithMathCopy calc= new CalculatorWithMathCopy();
        System.out.println("Результат математических операций: "  + calc.doSumm(4.1,(calc.doSumm(calc.doMultiplication(15,7),calc.doPov(calc.doDivision(28,5),2)))));
    }
    //140.45999999999998
}
