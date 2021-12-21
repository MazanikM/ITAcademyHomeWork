package home_work_2.arrays;

/*
Перебор массива при помощи do....while, while, for, foreach.
Элементы массива вводить используя ранее созданный arrayFromConsole. Все задачи в одном классе, в отдельных методах.
Должно получиться 3 метода (что такое метод https://metanit.com/java/tutorial/2.7.php):
		2.2.1. Вывести все элементы в консоль.
		2.2.2. Вывести каждый второй элемент массива в консоль.
		2.2.3. Вывести все элементы массива в консоль в обратном порядке.
 */

import static home_work_2.utils.ArraysUtils2_1.arrayFromConsole;

public class Arrays2_2 {
    public static void main(String[] args) {
        //allElementsInConsole();
        //secondElementsInConsole();
        reversElementsInConsole();
    }

    public static void allElementsInConsole(){
        int [] myArray = arrayFromConsole();

        int i = 0;
        do {
            System.out.print(myArray[i]);
            i++;
        } while (i < myArray.length);
        System.out.println("");
        System.out.println("_____");

        int k = 0;
        while (k < myArray.length){
            System.out.print(myArray[k]);
            k++;
        }
        System.out.println("");
        System.out.println("_____");

        for (int j = 0; j < myArray.length; j++){
            System.out.print(myArray[j]);
        }
        System.out.println("");
        System.out.println("_____");

        for (int elem : myArray){
            System.out.print(elem);
        }
        System.out.println("");
        System.out.println("_____");
    } // Выводим все элементы массива с помощью циклов do....while, while, for, foreach

    public static void secondElementsInConsole(){
        int [] myArray = arrayFromConsole();

        int i = 1;
        do {
            System.out.print(myArray[i]);
            i += 2;
        } while (i < myArray.length);
        System.out.println("");
        System.out.println("_____");

        int k = 1;
        while (k < myArray.length){
            System.out.print(myArray[k]);
            k += 2;
        }
        System.out.println("");
        System.out.println("_____");

        for (int j = 1; j < myArray.length; j += 2){
            System.out.print(myArray[j]);
        }
        System.out.println("");
        System.out.println("_____");

        int n = 0;
        for (int elem : myArray){
            if(n % 2 != 0){
                System.out.print(elem);
            }
            n++;
        }
        System.out.println("");
        System.out.println("_____");
    } // Выводим каждый второй элемент массива в консоль c помощью циклов do....while, while, for, foreach

    public static void reversElementsInConsole(){
        int [] myArray = arrayFromConsole();

        int i = myArray.length -1;
        do {
            System.out.print(myArray[i]);
            i --;
        } while (i >= 0);
        System.out.println("");
        System.out.println("_____");

        int k = myArray.length -1;
        while (k >= 0){
            System.out.print(myArray[k]);
            k--;
        }
        System.out.println("");
        System.out.println("_____");

        for (int j = myArray.length -1; j >= 0; j--){
            System.out.print(myArray[j]);
        }
        System.out.println("");
        System.out.println("_____");

        int n = myArray.length - 1;
        for (int elem : myArray){
            System.out.print(myArray[n]);
            n--;
        }
        System.out.println("");
        System.out.println("_____");
    } // Выводим все элементы массива в обратном порядке с помощью циклов do....while, while, for, foreach
}

