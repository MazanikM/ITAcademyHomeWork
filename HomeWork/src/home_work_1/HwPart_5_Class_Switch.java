package home_work_1;

import java.util.Scanner;

public class HwPart_5_Class_Switch {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Введите имя ");
        String name = scaner.nextLine();

        switch (name){
            case "Вася":
                System.out.println("Привет! \n" + "Я тебя так долго ждал!");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал!");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
