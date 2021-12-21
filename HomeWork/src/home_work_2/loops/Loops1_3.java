package home_work_2.loops;

/*
Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить,
Второе число это степень в которую возводят первое число. Степень - только положительная и целая.
Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
		1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
		1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Loops1_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("###,###.#");
        System.out.print("Введите 1е число ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите положительное целое 2е число ");
        int num2 = (int) scanner.nextDouble();
        double result = 1;
        if (num2 > 0){
            for (int i = 1; i <= num2; i++){
                result *= num1;
            }
        } else {
            System.out.println("Вы ввели не верное 2е число");
            return;
        }
        System.out.println(num1 + " ^ " + num2 + " = " + format.format(result));
    }
}
