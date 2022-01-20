package home_work_4_1_Collections;

import home_work_4_1_Collections.dto.Student;
import home_work_4_1_Collections.service.StudentsService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
        StudentsService sr = new StudentsService();

        List<Student> data = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            data.add(new Student(i + 1, sr.toRandomName(), sr.toStudentAge(), sr.toStudentMark(), sr.isOlympicStudent()));
        }

        List<Student> data2 = new ArrayList<>();

        System.out.println("_________________________________________________");
        System.out.println("Фильтрация студентов по возрасту и оценке, создание новой коллекции");

        for (Student student : data) {
            if ((student.getAge() > 11) && (student.getMark() > 8)) {
                data2.add(student);
            }
        }

        for (Student datum : data2) {    // вывели список отсортированных студентов
            System.out.println(datum);
        }

        System.out.println("_________________________________________________");
        System.out.println("Выводим средний возраст отфильтрованных студентов");

        int summAge = 0;
        for (Student datum : data2){
            summAge += datum.getAge();
        }
        System.out.println("Средний возраст отфильтрованных студентов: " + (double) summAge / data2.size());

        System.out.println("_________________________________________________");
        System.out.println("Фильтруем студентов по имени, от меньшего к большему, выводим ТОП 10");

        Collections.sort(data2, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });

        List<Student> dataName = data2.subList(0,10);
        for (Student studentNameTop10 : dataName){
            System.out.println(studentNameTop10);
        }

        System.out.println("_________________________________________________");
        System.out.println("Фильтруем студентов по оценке, от большему к меньшему, выводим ТОП 10");


        Collections.sort(data2, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getMark(), o1.getMark());
            }
        });

        List<Student> dataMark = data2.subList(0,10);
        for (Student studentMarkTop10 : dataMark){
            System.out.println(studentMarkTop10);
        }

        System.out.println("_________________________________________________");
        System.out.println("Фильтруем студентов по возрасту и оценке одновременно, выводим ТОП 10");

        Collections.sort(data2, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o2.getAge() - o1.getAge();
                if(result != 0) {
                    return result;
                }else{
                    return Double.compare(o2.getMark(),o1.getMark());
                }
            }
        });

        List<Student> dataMarkAge = data2.subList(0, 100);
        for (Student studentdMarkAgeTop10 : dataMarkAge) {
            System.out.println(studentdMarkAgeTop10);
        }


//        Collections.sort(data2, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                int result = o2.getAge() - o1.getAge();
//                return Double.compare(o1.getMark(), o2.getMark());
//
//            }
//        });
//    }
    }
}