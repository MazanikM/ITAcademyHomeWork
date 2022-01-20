package home_work_4_1_Collections.dto;

public class Student implements Comparable<Student> {

    private int number;
    private String name;
    private int age;
    private double mark;
    private boolean isOlympic;

    public Student(int number, String name, int age, double mark, boolean isOlympic) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.isOlympic = isOlympic;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    public boolean isOlympic() {
        return isOlympic;
    }

    @Override
    public String toString() {
        return "Студент номер: " +  number +
                ", Имя = " + name +
                ", Возраст = " + age +
                ", Оценка = " + mark +
                ", Участие в олимпиаде = " + isOlympic
                ;
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().length();
    }
}
