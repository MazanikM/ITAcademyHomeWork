package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();
        double result1 = calc.doDivision(28,5);
        calc.incrementCountOperation();
        double result2 = calc.doPov(result1,2);
        calc.incrementCountOperation();
        double result3 = calc.doMultiplication(15,7);
        calc.incrementCountOperation();
        double result4 = calc.doSumm(result2,result3);
        calc.incrementCountOperation();
        double totalResult = calc.doSumm(4.1,result4);
        calc.incrementCountOperation();
        System.out.println("Результат математических операций: " + totalResult);
        System.out.println("Счетчик операций: " + calc.getCountOperation());
    }
}
