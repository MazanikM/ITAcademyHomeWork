package home_work_2.arrays;

/*
Все задачи в одном классе, в отдельных методах. Для создания массивов использовать ранее созданный arrayRandom.
		2.4.1. Сумма четных положительных элементов массива
		2.4.2. Максимальный из элементов массива с четными индексами
		2.4.3. Элементы массива, которые меньше среднего арифметического
		2.4.4. Найти два наименьших (минимальных) элемента массива
		2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
		2.4.6. Сумма цифр массива
 */

import java.util.Arrays;
import java.util.Random;

public class Arrays2_4 {
    public static void main(String[] args) {
        //int [] container = maxElementWithEvenIndex();
        //int container2 = elementsLessThanAverage();
        //String container3 = twoMinimumArrayElements();
        //int[] container4 = compressAnArrays();
        int container5 = sumNumbersOfArray();
    }

    public static int sumOfEvenPositiveElements() {
        int summEven = 0;
        int[] myArray = {1, 50, -30, 47, 20, -90, 20, 46, 67, 22, 41, 47, 67};
        for (int i : myArray) {
            if (i > 0 && i % 2 == 0) {
                summEven += i;
            }
        }
        System.out.println("Ваш массив: " + Arrays.toString(myArray));
        System.out.println("Сумма положительных элементов массива с четным индексом равна: " + summEven);
        return summEven;
    }

    public static int[] maxElementWithEvenIndex() {
        int max = 0;
        int[] myArray = new int[30];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = new Random().nextInt(99);
            for (int k = 0; k < myArray.length; k += 2) {
                if (myArray[k] >= max) {
                    max = myArray[k];
                }

            }
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println("Максимальный элемент массива с четным индексом - " + max);
        return myArray;
    }

    public static int elementsLessThanAverage (){
        int sum = 0;
        int [] myArray = new int[30];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = random.nextInt(30);
            sum += myArray[i];
        }
        System.out.println("Ваш массив: " + Arrays.toString(myArray));
        System.out.println("Длина вашего массива: " + myArray.length);
        int mean = sum / 30;
        System.out.println("Среднее арифметическое значений массива составляет: " + mean);
        for (int i : myArray){
            if(myArray[i] < mean){
                System.out.println("Этот элемент массива меньше среднего значения: " + myArray[i]);
            }
        }
        return mean;
    }

    public static String twoMinimumArrayElements (){
        Random random = new Random();
        int [] myArray = new int [15];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = random.nextInt(20);
        }
        int min1 = myArray[0]; // находим минимальный элемент массива
        int min2 = myArray[0];
        for(int number : myArray){
            if(number < min1){
                min1 = number;
            }
        }
        for (int number : myArray){ // находим следующий минимальный элемент массива
            if((number < min2) && (number > min1)){
                min2 = number;
            }
        }
        String str = min1 + " " + min2;
        System.out.println("Ваш массив: " + Arrays.toString(myArray));
        System.out.println("Два наименьших (минимальных) значения из массива: " + str);
        return str;
    }

    public static int [] compressAnArrays (){
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        myArray = moveVal(myArray,3);
        myArray = moveVal(myArray,4);
        myArray = moveVal(myArray,5);
        myArray = moveVal(myArray,6);
        System.out.println("Массив до сжатия: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");
        System.out.println("Массив после сжатия: " + Arrays.toString(myArray));
        return myArray;
    }

    public static int[] moveVal(int[] array, int elem) {
        int[] result = new int[array.length];
        int c = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] != elem) {
                result[i-c] = array[i];
            }
            else {
                c++;
            }
        }
        return result;
    }

    public static int sumNumbersOfArray(){
        int summ = 0;
        int i = 0;
        int[] myArray = {12, 104, 81};
        int[] myArray2 = myArray.clone();
        int arrayLen = myArray.length;
        while (arrayLen > 0){
            while (myArray[i] > 0){
                summ += myArray[i] % 10;
                myArray[i] /= 10;
            }
            i++;
            arrayLen--;
        }
        System.out.println("Исходный массив: " + Arrays.toString(myArray2));
        System.out.println("Сумма цифр исходного массива равна: " + summ);
        return summ;
    }
}

