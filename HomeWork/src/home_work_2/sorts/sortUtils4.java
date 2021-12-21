package home_work_2.sorts;

/*
Выполнить сортировку массива с числами:
	4.1. После каждой сортировки в консоли у вас должно получиться
	"[Какой массив был до сортировки] -> [Каким стал массив после сортировки]".
Для преобразования массива в текст можно использовать класс Arrays.
	4.2. Создать класс SortsUtils. Пишем в нём следующие алгоритмы:
		4.2.1. Пузырьковая сортировка
		4.2.2. Шейкерная сортировка
	4.3. Для тестов используем предварительно созданные массивы (в коде ваши тесты должны остаться):
		4.3.1. {1,2,3,4,5,6}
		4.3.2. {1,1,1,1}
		4.3.3. {9,1,5,99,9,9}
		4.3.4. {}
		4.3.5. {6,5,4,3,2,1}
	4.4. После тестов написать код который будет массив через ранее созданный arrayRandom. Отсортировать.
	4.5. После рандома написать код который будет создавать массив через ранее созданный arrayFromConsole. Отсортировать.
 */

import java.util.Arrays;
import static home_work_2.utils.ArraysUtils2_1.arrayRandom;
import static home_work_2.utils.ArraysUtils2_1.arrayFromConsole;

public class sortUtils4 {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {1,1,1,1}; // сортировка не требуется
        int[] array3 = {9,1,5,99,9,9};
        int[] array4 = {}; // сортировка не требуется
        int[] array5 = {6,5,4,3,2,1};

        System.out.println("Массив до сортировки: " + Arrays.toString(array1));
        bubbleSort(array1);
        System.out.println("Массив после сортировки: " + Arrays.toString(array1));

        System.out.println("_____\n_____");

        System.out.println("Массив до сортировки: " + Arrays.toString(array3));
        bubbleSort(array3);
        System.out.println("Массив после сортировки: " + Arrays.toString(array3));

        System.out.println("_____\n_____");

        System.out.println("Массив до сортировки: " + Arrays.toString(array5));
        sheikerSort(array5);
        System.out.println("Массив после сортировки: " + Arrays.toString(array5));

        System.out.println("_____\n_____"); // 4.4

        int [] myArray1 = arrayRandom(5, 99);
        System.out.println("Массив до сортировки: " + Arrays.toString(myArray1));
        bubbleSort(myArray1);
        System.out.println("Массив после сортировки: " + Arrays.toString(myArray1));

        System.out.println("_____\n_____");

        int [] myArray2 = arrayRandom(5, 99);
        System.out.println("Массив до сортировки: " + Arrays.toString(myArray2));
        sheikerSort(myArray2);
        System.out.println("Массив после сортировки: " + Arrays.toString(myArray2));

        System.out.println("_____\n_____"); // 4.5

        int [] myArray3 = arrayFromConsole();
        System.out.println("Массив до сортировки: " + Arrays.toString(myArray3));
        bubbleSort(myArray3);
        System.out.println("Массив после сортировки: " + Arrays.toString(myArray3));

        System.out.println("_____\n_____");

        int [] myArray4 = arrayFromConsole();
        System.out.println("Массив до сортировки: " + Arrays.toString(myArray4));
        sheikerSort(myArray4);
        System.out.println("Массив после сортировки: " + Arrays.toString(myArray4));

    }

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1 ; i++){
            for (int j = i + 1; j < array.length; j++){
                if(array[i] < array[j]){
                    int bufNum = array[i];
                    array[i] = array[j];
                    array[j] = bufNum;
                }
            }
        }
    }
    public static void sheikerSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length -1; j++){
                if(array[j] > array[j + 1]){
                    int bufNum = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = bufNum;
                }
            }
        }
    }
}
