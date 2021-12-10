package home_work_1;

import java.util.Scanner;
import java.util.Objects;

public class TaskFiveClassIf {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.print("Введите имя ");
        String name = scaner.nextLine();

        boolean isVasya = Objects.equals(name, "Вася");
        boolean isAnastasiya = Objects.equals(name, "Анастасия");
        if (isVasya){
            System.out.println("Привет! \n" + "Я тебя так долго ждал");
        }
        if (isAnastasiya){
            System.out.println("Я тебя так долго ждал");
        }
        if (!isVasya && !isAnastasiya){
            System.out.println("Добрый день, а вы кто?");
        }
    }
}