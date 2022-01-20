package home_work_4_2_Container;

import home_work_4_2_Container.dto.DataContainer;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>(new String[0]); //Тут есть подвох в конструкторе, он возможно будет выглядеть не так
        // как тут написано, возможно туда придётся что-то передать, думайте пока сами

        int index1 = container.add("Привет");
        int index2 = container.add(null);
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        int index5 = container.add("777");
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
        System.out.println(index5);
        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        System.out.println(text1); //Привет
        System.out.println(text2); //Как дела
        System.out.println(text3); //Работаю
        System.out.println(text4); //Давай потом
        container.delete(text1);
        System.out.println(container.toString()); //Как дела
//    }

    }
}
