package home_work_1;

public class TaskThree {

    double PI; // константа, переменная Пи

    public static void main(String[] args) {


        // возвращение абсолютного значения аргумента

        double resultAbsDouble = Math.abs(-18.9); // 18,9
        float resultAbsFloat = Math.abs(-8.4F); // 8,4F
        int resultAbsInt = Math.abs(-50); // 50
        long resultAbsLong = Math.abs(-24L); //24L
        //System.out.println(resultAbsInt);

        // возвращение результата тригонометрических функций

        double resultAcos = Math.acos(-1.0); // арккосинус = 3.141
        double resultAsin = Math.asin(-0.8); // аркcинус = -0.927 (диапазон от -1 до 1)
        double resultAtan = Math.atan(1.5); // арктангенс = 0.982
        double resultCos = Math.cos(-9.5); // косинус = -0.997
        double resultSin = Math.sin(-27.5); // синус = -0.699
        double resultTan = Math.tan(35.9); // синус = -4.303
        //System.out.println(resultTan);

        // возвращение результата математических операций

        double resultcbrt = Math.cbrt(4.0); // возвращение кубического корня = 1.587
        double resultsqrt = Math.sqrt(4.0); // возвращение квадратного корня = 2.0
        double resultLog10 = Math.log10(25.0); // возвращение десятичного логарифма = 1.397
        double resultPow = Math.pow(10.0, 5.0); // возвращает число 10, возведенное в степень 5 = 100000.0
        int resultFloorDiv = Math.floorDiv(57, 3); // возвращает целочисленный результат деления 57 на 3 = 19
        double resultLog = Math.log(45.9); // возвращает натуральный логарифм = 3.826
        double resultRound = Math.round(4.6); // возвращает число округленное до ближайшего целого числа, результат 5,0
        // если знак после запятой > 0, и < 6 = округляет в меньшую сторону, а если >= 6 - в большую
        double resultScalb = Math.scalb(5, 7); // (double value, int factor) возвращает произведение числа value на 2 в степени factor
        double resultFloor = Math.floor(8.8); // возвращает наибольшее целое число, которое не больше принимаемого аргумента = 8.0
        double resultExp = Math.exp(52.0); // возвращает основание натурального логарифма = 3.831
        int resultmin = Math.min(52, 44); // возвращает минимальное число из a и b = 44
        int resultmax = Math.max(34, 68); // возвращает максимальное число из a и b = 68
        double resulRint = Math.rint(5.4); // возвращает double число, которое представляет ближайшее к целому числу
        //System.out.println(resultRound);

        // генерация случайных чисел

        System.out.println(Math.random()); // выводит на консоль склучайное число в диапазоне [0, 1)

        for (int i = 0; i < 5; i++) {      // цикл из 5 ти случайных чисел от 0 до 10, округленных в меньшую сторону
            System.out.println(Math.ceil(Math.random() * 10));
        }

        int[] array = new int[7]; // инициализация массива состоящего из 7ми элементов
        for (int i = 0; i < array.length; i++) { // заполнение массива с помощью цикла и генерации случайных чисел от 0 до 25
            array[i] = ((int) (Math.random() * 25));
            System.out.println(array[i]);

        }
    }
}