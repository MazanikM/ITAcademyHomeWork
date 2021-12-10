package home_work_1;
import java.util.Scanner;
import java.util.Objects;

public class HwPart_5_Class_ElseIf {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Введите имя ");
        String name = scaner.nextLine();

        boolean isVasya = Objects.equals(name, "Вася");
        boolean isAnastasiya = Objects.equals(name, "Анастасия");
        if (isVasya){
            System.out.println("Привет! \n" + "Я тебя так долго ждал");
        } else if (isAnastasiya){
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
