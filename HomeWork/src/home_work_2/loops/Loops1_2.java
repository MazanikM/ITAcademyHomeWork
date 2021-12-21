package home_work_2.loops;

/*
Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и
вывести ход вычислений в консоль.
Пользователь обязан ввести целое число.
Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
		1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
		1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
		1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число
 */

import javax.sound.midi.Soundbank;

public class Loops1_2 {

    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int result = 1;
        int num = 0;
        char[] chars = args[0].toCharArray();
        String dobl = Integer.toString(x);
        if(!dobl.contains(".")){
            for (int i = 0; x > 0; i++){
                num = x % 10;
                System.out.print(chars[i]);
                x  = x / 10;
                if (x != 0){
                    System.out.print(" * ");
                }
                result *= num;
            }
            System.out.println(" = " + result);
            return;
        } else if (dobl.contains(".")){
            System.out.println("Введено не целое число");
            return;
        } else {
            System.out.println("Введено не число");
        }
    }
}
