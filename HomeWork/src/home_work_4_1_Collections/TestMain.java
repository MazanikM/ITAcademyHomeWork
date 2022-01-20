package home_work_4_1_Collections;

import java.util.Random;

public class TestMain {

    public static void main(String[] args) {

        Random rnd = new Random();
        String result;
        String [] name = new String[8];

        for (int i = 0; i < 8; i++){
            int num = 31; // rnd.nextInt(30); // 1103
            name[i] = String.valueOf(('а' + num));
        }
        System.out.println(name[0]);
    }
}
