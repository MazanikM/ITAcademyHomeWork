package home_work_1;

public class TaskFour {

    static boolean SleepIn(boolean weekday, boolean vacation) {
        if (weekday == true || vacation == true) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        boolean toWork = SleepIn(false, true);
        if (toWork) {
            System.out.println("Можем спать дальше");
        } else {
            System.out.println("Пора идти на работу");
        }
    }
}
