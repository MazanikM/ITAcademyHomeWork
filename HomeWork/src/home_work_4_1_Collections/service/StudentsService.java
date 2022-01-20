package home_work_4_1_Collections.service;

import java.util.Random;

public class StudentsService {

    Random rnd = new Random();

    public String toStudentName(){
        String result = "";
        int sizeArray = 3 + rnd.nextInt(10);
        String [] name = new String[sizeArray];
        for (int i = 0; i < name.length; i++){
            name[i] = String.valueOf((char) ('а' + rnd.nextInt(31)));
            result += name[i];
        }
        return result.substring(0, 1).toUpperCase() + result.substring(1);

    }

    public String toRandomName (){
        String [] nameStudents = {"Александр", "Анатолий", "Борис", "Виктор", "Владимир", "Денис", "Максим", "Ярослав", "Анна", "Алеся", "Виктория", "Мария", "Наталья", "Татьяна", "Яна"};
        int index = new Random().nextInt(nameStudents.length);
        return nameStudents[index];
    }

    public int toStudentAge(){
        return rnd.nextInt(17 - 7) + 8;
    }

    public double toStudentMark(){
        double result = rnd.nextDouble() * 10;
        return Math.round(result * 100) / 100.0;
    }

    public boolean isOlympicStudent(){
        return rnd.nextBoolean();
    }


//    public int firstChar(){
//        int first = 0;
//        int [] array = new int[31];
//        for (int i = 0; i < array.length; i++) {
//            first = i;
//        }// 7, 11, 24, 27, 28, 29, 30
//
//        return first;
//    }
}
