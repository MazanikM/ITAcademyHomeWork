package home_work_3.runners;


import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface calc = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        System.out.println("Результат математических операций: "  + calc.doSumm(4.1,(calc.doSumm(calc.doMultiplication(15,7),calc.doPov(calc.doDivision(28,5),2)))));
        System.out.println("Счетчик операций: " + calc.getCountOperation());
    }
}