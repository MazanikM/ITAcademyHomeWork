package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {

    public static void main(String[] args) {

        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
        System.out.println("Результат математических операций: "  + calc.doSumm(4.1,(calc.doSumm(calc.doMultiplication(15,7),calc.doPov(calc.doDivision(28,5),2)))));
        //140.45999999999998
    }
}
