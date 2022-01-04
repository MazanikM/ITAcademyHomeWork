package home_work_3.runners;

import home_work_3.calcs.CalculatorWithOperator;
import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calc1 = new CalculatorWithCounterAutoComposite();
        System.out.println("Результат математических операций: " + calc1.doSumm(4.1,(calc1.doSumm(calc1.doMultiplication(15,7),calc1.doPov(calc1.doDivision(28,5),2)))));
        System.out.println("Счетчик операций: " + calc1.getCountOperation());

        CalculatorWithCounterAutoAgregation calc2 = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathExtends());
        System.out.println("Результат математических операций: "  + calc2.doSumm(4.1,(calc2.doSumm(calc2.doMultiplication(15,7),calc2.doPov(calc2.doDivision(28,5),2)))));
        System.out.println("Счетчик операций: " + calc2.getCountOperation());

        CalculatorWithCounterAutoAgregation calc3 = new CalculatorWithCounterAutoAgregation(new CalculatorWithOperator());
        System.out.println("Результат математических операций: "  + calc3.doSumm(4.1,(calc3.doSumm(calc3.doMultiplication(15,7),calc3.doPov(calc3.doDivision(28,5),2)))));
        System.out.println("Счетчик операций: " + calc3.getCountOperation());

        CalculatorWithCounterAutoAgregation calc4 = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        System.out.println("Результат математических операций: "  + calc4.doSumm(4.1,(calc4.doSumm(calc4.doMultiplication(15,7),calc4.doPov(calc4.doDivision(28,5),2)))));
        System.out.println("Счетчик операций: " + calc4.getCountOperation());

    }
}
