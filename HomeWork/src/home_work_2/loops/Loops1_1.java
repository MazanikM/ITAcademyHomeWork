package home_work_2.loops;

/*
Циклы. Для преобразования строки в число можно использовать http://proglang.su/java/numbers-parseint,
если хотите можете добавить проверки на корректность ввода данных.
Число положительное, максимум long:
   1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю. Пример: Ввели 5, должно получиться в консоли:
 1 * 2 * 3 * 4 * 5 = ответ
1.1.1. Используя только цикл
1.1.2.* Используя рекурсию
 */

public class Loops1_1 {

    public static void main(String[] args) {

        long x = Long.parseLong(args[0]);
        long result = 1;
        long strSumm = 0;
        if (x > 100){
            System.out.println("Введенное число переполнено, введите число меньше");
            return;
        }
        if ( x > 0){
            for (int i = 0; i < x; i++) { // 1 * 2 * 3 * 4 * 5 = ответ
                strSumm += 1;
                result *= strSumm;
                System.out.print(strSumm);
                if (i < x - 1) {
                    System.out.print(" * ");
                }
            }
            System.out.print(" = " + result);
        }
        else {
            System.out.println("Вы ввели отрицательное число");
            return;
        }
    }
}