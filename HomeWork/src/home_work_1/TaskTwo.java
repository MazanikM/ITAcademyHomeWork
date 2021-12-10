package home_work_1;

public class TaskTwo {
    public static void main(String[] args) {
        int a = 5, b = 2, c = 8, d = 7, e = 20, f = 22, g = 68, h = 3, m = 12;
        boolean tr = true;
        boolean fl = false;
        System.out.println((float) (a + b / c)); // результат от целочисленного деления 0, суммируем с числом 5
        System.out.println((float) (a + b) / c);
        System.out.println((float) (a + b++) / c);
        System.out.println((float) (a + b++) / --c);
        System.out.println((float) (a * b >> b++) / --c);
        System.out.println((a + d > e ? g : f * b >> b++) / --c); // условие false, поскольку 12 < 20, следовательно
        //System.out.println((a + d > e ? g >= g : f * b >> b++) / --c); // ошибка компиляции, булевый результат сравнения >= не может быть разделен на число
    }
}
